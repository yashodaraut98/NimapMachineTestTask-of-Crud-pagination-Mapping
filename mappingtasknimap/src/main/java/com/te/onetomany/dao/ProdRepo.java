package com.te.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.onetomany.procat.Products;

public interface ProdRepo extends JpaRepository<Products, Integer> {

}
