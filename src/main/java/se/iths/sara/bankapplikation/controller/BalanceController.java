package se.iths.sara.bankapplikation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sara.bankapplikation.service.ATMService;

@Controller
public class BalanceController {

    private final ATMService atmService;

    public BalanceController(ATMService atmService) {
        this.atmService = atmService;
    }

    @GetMapping("/balance")
    public String balance(Model model) {
        model.addAttribute("balance", atmService.getBalance());
        return "balance";
    }
}
