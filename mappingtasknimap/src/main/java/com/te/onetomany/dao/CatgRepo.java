package com.te.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.onetomany.procat.Categories;
import com.te.onetomany.procat.Products;

public interface CatgRepo extends JpaRepository<Categories, Integer>{

	Categories save(Products prodd);

}
