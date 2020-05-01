package com.devstale.pattern.abstractfactory.factory.concrete;

import com.devstale.pattern.abstractfactory.factory.AbstractApplicationFactory;
import com.devstale.pattern.abstractfactory.product.Exporter;
import com.devstale.pattern.abstractfactory.product.Repository;
import com.devstale.pattern.abstractfactory.product.Storage;
import com.devstale.pattern.abstractfactory.product.concrete.CSVExporter;
import com.devstale.pattern.abstractfactory.product.concrete.FileSystemStorage;
import com.devstale.pattern.abstractfactory.product.concrete.JDBCRepository;

public class LocalApplicationFactory implements AbstractApplicationFactory {

	static LocalApplicationFactory instance;
	
	private LocalApplicationFactory() {
		//private constructor
	}
	
	public static LocalApplicationFactory getInstance() {
		//single access point to instance
		return instance == null ? new LocalApplicationFactory() : instance;
	}
	
	@Override
	public Repository createRepository() {
		return new JDBCRepository();
	}

	@Override
	public Exporter createExporter() {
		return new CSVExporter();
	}

	@Override
	public Storage createStorage() {
		return new FileSystemStorage();
	}
	
}
