package com.example.finance;


import com.example.finance.model.Expense;
import com.example.finance.model.Users;
import com.example.finance.service.ExpenseService;
import com.example.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class FinanceController {

    @Autowired
    Users user;

    @Autowired
    UserService userService;

    @Autowired
    ExpenseService expenseService;

    @Autowired
    Expense expense;

    @PostMapping("/create")
    public void createUser(@RequestBody Users user){
        System.out.println(user.toString());
        userService.createUser(user);
    }

    @GetMapping("/expenses/{userId}")
    public List<Expense> getExpenses(@PathVariable int userId){
        return expenseService.getExpenses(userId);
    }

    @PostMapping("/createExpense")
    public void createExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
    }


}
