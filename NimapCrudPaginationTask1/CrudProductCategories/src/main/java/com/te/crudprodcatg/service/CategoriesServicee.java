package com.te.crudprodcatg.service;

import java.util.List;

import com.te.crudprodcatg.dto.Categories;

public interface CategoriesServicee {

	Categories save(Categories cat);

	Categories updateCatg(Categories catg, int c_id);

	void deleteCatg(int c_id);

	List<Categories> getCatg();

	Categories getById(int c_id);

}
