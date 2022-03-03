package com.mk.bigBank.controller;

import com.mk.bigBank.model.LoanRequest;
import com.mk.bigBank.model.User;
import com.mk.bigBank.service.LoanService;
import com.mk.bigBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoanService loanService;

    @GetMapping("/profile")
    public String userView(Model model) {
        model.addAttribute("loanRequest", new LoanRequest());
        return "profile";
    }

    @GetMapping("/admin")
    public String adminView(Model model) {
        model.addAttribute("num", userService.sumOfAllCalculation());
        return "admin";
    }

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String loanRequest(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        userService.save(user);
        return "redirect:/";
    }

    @PostMapping("/process_loan")
    public String processLoan(Model model, LoanRequest loanRequest) {
        userService.updateCalculationNumber();
        model.addAttribute("isAllow", loanService.calculate(loanRequest));
        model.addAttribute("loan", "Loan Details:   FIS: " + loanRequest.getfIS() + " ,SEC: " + loanRequest.getsEC() + " ,THI: " + loanRequest.gettHI());
        return "loans";
    }

//    @GetMapping("/list_users")
//    public String viewUsersList() {
//        List<User> listUsers = userService.findAll();
//
//
//        return "users";
//    }

}
