package com.te.crudprodcatg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.crudprodcatg.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
