package com.github.tulesaza.ironbank.model.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Bank {
    @Id
    long id;
    long totalAmount;

    public void credit(long amount){
        totalAmount -= amount;
    }

}