package com.te.crudprodcatg.service;

import java.util.List;

import com.te.crudprodcatg.dto.Product;

public interface ProductService {

	Product save(Product pro);

	List<Product> getProd();

	Product updateProd(Product prod, int p_id);

	void deleteProd(int p_id);

}
