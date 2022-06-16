package com.te.crudprodcatg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crudprodcatg.dao.ProductRepo;
import com.te.crudprodcatg.dto.Product;
import com.te.crudprodcatg.exception.ResourceNotFoundException;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
private ProductRepo d;

	public ProductServiceImpl(ProductRepo d) {
		super();
		this.d = d;
	}

	@Override
	public Product save(Product pro) {
		return d.save(pro);
	}

	@Override
	public List<Product> getProd() {
		return d.findAll();
	}

	@Override
	public Product updateProd(Product prod, int p_id) {
		
	
		Product existOrNot=d.findById(p_id).orElseThrow(
		()-> new ResourceNotFoundException("Product","p_id",p_id));
		
		existOrNot.setP_name(prod.getP_name());
	d.save(existOrNot);

		return existOrNot;
	
	}

	@Override
	public void deleteProd(int p_id) {
		d.findById(p_id).orElseThrow(
				()-> new ResourceNotFoundException("Product", "p_id", p_id));
		d.deleteById(p_id);
		
	}


}

