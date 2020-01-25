package ru.ladonov.springcrud.repository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import ru.ladonov.springcrud.model.Income;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository
public class IncomesDAOImpl implements IncomesDAO {

    @Autowired
    private final JdbcOperations jdbcOperations;

    @Override
    public List<Income> findAll() {
        return jdbcOperations.query("select * from incomes", resultSet -> {
            List<Income> list = new ArrayList<>();
            while (resultSet.next()){
                list.add(extractValue(resultSet));
            }
            return list;
        });
    }

    private Income extractValue(ResultSet rs) throws SQLException {
        Income income = new Income();
        income.setId(rs.getInt("id"));
        income.setAmount(rs.getDouble("amount"));
        income.setCommentary(rs.getString("commentary"));
        return income;
    }
}
