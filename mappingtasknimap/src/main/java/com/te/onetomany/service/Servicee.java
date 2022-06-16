package com.te.onetomany.service;

import java.util.List;

import com.te.onetomany.procat.Categories;
import com.te.onetomany.procat.Products;

public interface Servicee {

	List<Categories> getCatg();

	Categories save(Categories catg);

	

	
}
