package com.devstale.pattern.abstractfactory.product;

import java.time.LocalDate;
import java.util.Collection;

import com.devstale.pattern.exception.RepositoryException;

public interface Repository {
	
	Collection<Expense> findExpenses(LocalDate from, LocalDate to) throws RepositoryException;

}
