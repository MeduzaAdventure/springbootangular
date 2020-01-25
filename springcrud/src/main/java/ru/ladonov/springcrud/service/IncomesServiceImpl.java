package ru.ladonov.springcrud.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ladonov.springcrud.model.Income;
import ru.ladonov.springcrud.repository.IncomesDAO;

import java.util.List;

@Service
public class IncomesServiceImpl implements IncomesService {

    @Autowired
    private IncomesDAO incomesDAO;

    @Override
    @Transactional
    public List<Income> getIncomes() {
        return incomesDAO.findAll();
    }
}
