package com.github.tulesaza.ironbank.service;

import com.github.tulesaza.ironbank.model.entity.Bank;
import com.github.tulesaza.ironbank.repository.MoneyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TransferMoneyProphecyBackend implements TransferMoneyService {
    private final MoneyRepository repository;
    private final ProphetService prophet;

    @Override
    public long transfer(String addresseeName, long amount) {
        Bank bank = repository.findAll().get(0);

        if (bank.getTotalAmount() > amount && prophet.willSurvive(addresseeName)) {
            bank.credit(amount);
            return repository.save(bank).getTotalAmount();
        }

        return -1;
    }

}
