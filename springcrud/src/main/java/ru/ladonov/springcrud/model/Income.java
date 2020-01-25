package ru.ladonov.springcrud.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Income {
    private int id;
    private double amount;
    private String commentary;
}
