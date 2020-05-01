package com.devstale.pattern.abstractfactory.product.concrete;

import java.time.LocalDate;
import java.util.Collection;

import com.devstale.pattern.abstractfactory.product.Expense;
import com.devstale.pattern.abstractfactory.product.Repository;

public class MongoDBRepository implements Repository {

	@Override
	public Collection<Expense> findExpenses(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

}
