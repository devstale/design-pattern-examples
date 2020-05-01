package com.devstale.pattern.abstractfactory.factory;

import com.devstale.pattern.abstractfactory.product.Exporter;
import com.devstale.pattern.abstractfactory.product.Repository;
import com.devstale.pattern.abstractfactory.product.Storage;

public interface AbstractApplicationFactory {
	
	Repository createRepository();
	Exporter createExporter();
	Storage createStorage();
	
}
