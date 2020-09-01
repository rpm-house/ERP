/**
 * 
 */
package com.rpm.erp.service;

import java.util.List;

import com.rpm.erp.model.Expense;

/**
 * @author I349013
 *
 */
public interface IExpenseService {
	
	
	public Expense saveOrUpdate(Expense expense);
	
	public List<Expense> getExpenseList();
	
	public String deleteExpense(long expenseId);
	
	public Expense getExpenseById();
	
	

}
