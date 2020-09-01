package com.rpm.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rpm.erp.model.Expense;

/**
 * @author MohanRamu
 *
 */

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, Integer>, CustomQuery<Expense> {

}
