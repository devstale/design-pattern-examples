package com.devstale.pattern.abstractfactory.product;

import java.io.File;

import com.devstale.pattern.exception.StorageException;

public interface Storage {
	
	void store(File report) throws StorageException; 
	
}
