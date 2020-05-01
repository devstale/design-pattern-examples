package com.devstale.pattern.abstractfactory.product.concrete;

import java.io.File;

import com.devstale.pattern.abstractfactory.product.Storage;
import com.devstale.pattern.exception.StorageException;

public class FileSystemStorage implements Storage {

	@Override
	public void store(File report) throws StorageException {
		// TODO Auto-generated method stub
	}

}
