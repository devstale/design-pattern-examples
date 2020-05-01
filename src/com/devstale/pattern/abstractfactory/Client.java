package com.devstale.pattern.abstractfactory;

import java.io.File;
import java.time.LocalDate;
import java.util.Collection;

import com.devstale.pattern.abstractfactory.factory.AbstractApplicationFactory;
import com.devstale.pattern.abstractfactory.factory.concrete.CloudApplicationFactory;
import com.devstale.pattern.abstractfactory.product.Expense;
import com.devstale.pattern.abstractfactory.product.Exporter;
import com.devstale.pattern.abstractfactory.product.Repository;
import com.devstale.pattern.abstractfactory.product.Storage;

public class Client {
	
	public static void main( String[] args ) {
		
		AbstractApplicationFactory factory = CloudApplicationFactory.getInstance();
		Exporter exporter = factory.createExporter();
		Repository repository  = factory.createRepository();
		Storage storage = factory.createStorage();
		try {
			Collection<Expense> last30DaysExpenses = 
					repository.findExpenses(LocalDate.now(), LocalDate.now().minusDays(30));
			File report = exporter.export(last30DaysExpenses);
			storage.store(report);
		} catch (Exception e) {
			System.out.println("Something wrong but... DON'T PANIC!");
		}
	}
}
