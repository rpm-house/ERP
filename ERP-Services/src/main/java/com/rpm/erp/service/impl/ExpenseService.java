/**
 * 
 */
package com.rpm.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpm.erp.model.Expense;
import com.rpm.erp.repository.ExpenseRepository;
import com.rpm.erp.service.IExpenseService;

/**
 * @author I349013
 *
 */
@Service
public class ExpenseService implements IExpenseService {

	@Autowired
	ExpenseRepository expenseRepo;

	@Override
	public Expense saveOrUpdate(Expense expense) {
		return expenseRepo.save(expense);
	}

	@Override
	public List<Expense> getExpenseList() {
		return expenseRepo.findAll();
	}

	@Override
	public String deleteExpense(long expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense getExpenseById() {
		// TODO Auto-generated method stub
		return null;
	}

}
