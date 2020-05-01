package com.devstale.pattern.abstractfactory.product.concrete;

import java.io.File;
import java.util.Collection;

import com.devstale.pattern.abstractfactory.product.Expense;
import com.devstale.pattern.abstractfactory.product.Exporter;
import com.devstale.pattern.exception.ExportException;

public class CSVExporter implements Exporter {
	
	@Override
	public File export(Collection<Expense> expenses) throws ExportException {
		// TODO Auto-generated method stub
		return null;
	}

}
