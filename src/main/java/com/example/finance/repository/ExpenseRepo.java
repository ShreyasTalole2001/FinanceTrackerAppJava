package com.example.finance.repository;

import com.example.finance.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepo extends JpaRepository<Expense, Integer> {
//    List<Expense> findById(int id);
      List<Expense> findByuId(int uId);
}
