package ru.ladonov.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ladonov.springcrud.model.Income;
import ru.ladonov.springcrud.service.IncomesService;

import java.util.List;

@RestController
public class IncomesController {

    @Autowired
    IncomesService incomesService;

    @GetMapping("/incomes")
    public List<Income> getIncomes(){
        return incomesService.getIncomes();
    }
}
