package com.devstale.pattern.abstractfactory.factory.concrete;

import com.devstale.pattern.abstractfactory.factory.AbstractApplicationFactory;
import com.devstale.pattern.abstractfactory.product.Exporter;
import com.devstale.pattern.abstractfactory.product.Repository;
import com.devstale.pattern.abstractfactory.product.Storage;
import com.devstale.pattern.abstractfactory.product.concrete.MongoDBRepository;
import com.devstale.pattern.abstractfactory.product.concrete.PDFExporter;
import com.devstale.pattern.abstractfactory.product.concrete.S3Storage;

public class CloudApplicationFactory implements AbstractApplicationFactory{

	static CloudApplicationFactory instance;
	
	private CloudApplicationFactory() {
		//private constructor
	}
	
	public static CloudApplicationFactory getInstance() {
		//single access point to instance
		return instance == null ? new CloudApplicationFactory() : instance;
	}
	
	@Override
	public Repository createRepository() {
		return new MongoDBRepository();
	}

	@Override
	public Exporter createExporter() {
		return new PDFExporter();
	}

	@Override
	public Storage createStorage() {
		return new S3Storage();
	}

}
