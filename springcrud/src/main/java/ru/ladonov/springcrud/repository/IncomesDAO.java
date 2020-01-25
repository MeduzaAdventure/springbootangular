package ru.ladonov.springcrud.repository;

import ru.ladonov.springcrud.model.Income;

import java.util.List;

public interface IncomesDAO {
    List<Income> findAll();
}
