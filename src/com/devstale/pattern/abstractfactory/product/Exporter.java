package com.devstale.pattern.abstractfactory.product;

import java.io.File;
import java.util.Collection;

import com.devstale.pattern.exception.ExportException;

public interface Exporter {
	
	File export( Collection<Expense> expenses ) throws ExportException;

}
