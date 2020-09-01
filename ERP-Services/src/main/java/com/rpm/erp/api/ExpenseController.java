package com.rpm.erp.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpm.erp.model.Expense;
import com.rpm.erp.service.IExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

	private static final Logger logger = LoggerFactory.getLogger(ExpenseController.class);

	@Autowired
	IExpenseService expenseService;
	
	
	@PostMapping(value = "/create")
	public String create(@RequestBody Expense expense) {
		logger.debug("Saving Expenses.");
		expenseService.saveOrUpdate(expense);
		return "Expense records created.";
	}
	

	@GetMapping(value = "/list")
	public List<Expense> parseLoadRunnerResult() {
		logger.debug("List Expenses.");
		return expenseService.getExpenseList();
	}

}
