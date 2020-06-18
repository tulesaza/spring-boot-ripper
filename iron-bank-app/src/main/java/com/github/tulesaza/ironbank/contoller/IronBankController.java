package com.github.tulesaza.ironbank.contoller;


import com.github.tulesaza.ironbank.repository.MoneyRepository;
import com.github.tulesaza.ironbank.service.TransferMoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
@RequiredArgsConstructor
public class IronBankController {
    private final TransferMoneyService transferMoney;
    private final MoneyRepository repository;

    @GetMapping("/credit")
    public String credit(@RequestParam String name, @RequestParam long amount) {
        long resultDeposit = transferMoney.transfer(name, amount);
        if (resultDeposit == -1) {
            return "Rejected<br/>" + name + " <b>will not </b>survive this winter";
        }
        return format(
                "<i>Credit approved for %s<i> <br/>Current balance: <b>%s</b>",
                name,
                resultDeposit
        );
    }

    @GetMapping("/status")
    public long currentStatus() {
        return repository.findAll().get(0).getTotalAmount();
    }
}
