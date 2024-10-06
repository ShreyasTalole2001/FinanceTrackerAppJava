package com.example.finance.service;

import com.example.finance.model.Expense;
import com.example.finance.repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepo repo;

    @Autowired
    Expense expense;

    public List<Expense> getExpenses(int userId){
        return repo.findByuId(userId);
    }

    public void addExpense(Expense expense){
        repo.save(expense);
    }

}
