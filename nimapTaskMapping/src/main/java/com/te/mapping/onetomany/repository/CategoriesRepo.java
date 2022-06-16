package com.te.mapping.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.mapping.onetomany.Categories;
@Repository
public interface CategoriesRepo extends JpaRepository<Categories, Integer> {

}
