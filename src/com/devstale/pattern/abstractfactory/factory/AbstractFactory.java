package com.devstale.pattern.abstractfactory.factory;

import com.devstale.pattern.abstractfactory.product.Product;

public interface AbstractFactory {
	
	enum ProductType { REPOSIROTY, EXPORTER, STORAGE };
	
	Product create( ProductType type );

}
