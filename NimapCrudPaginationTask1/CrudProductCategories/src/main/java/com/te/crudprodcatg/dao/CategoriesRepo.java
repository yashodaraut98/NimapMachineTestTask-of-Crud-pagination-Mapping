package com.te.crudprodcatg.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.crudprodcatg.dto.Categories;

public interface CategoriesRepo extends JpaRepository<Categories, Integer>{

	
}
