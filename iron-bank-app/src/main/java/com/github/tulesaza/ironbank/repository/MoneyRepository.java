package com.github.tulesaza.ironbank.repository;

import com.github.tulesaza.ironbank.model.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Bank,String> {
}
