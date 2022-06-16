package com.te.crudprodcatg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crudprodcatg.dao.CategoriesRepo;
import com.te.crudprodcatg.dto.Categories;
import com.te.crudprodcatg.exception.ResourceNotFoundException;



@Service
public class CategoriesServiceImpl implements CategoriesServicee {
	
	@Autowired
private CategoriesRepo catrep;

	public CategoriesServiceImpl(CategoriesRepo catrep) {
	super();
	this.catrep = catrep;

	}
	@Override
	public Categories save(Categories cat) {
		return catrep.save(cat);
	}

	public List<Categories> getCatg() {
		return catrep.findAll();
	}

	
	public Categories getById(int c_id) {
//		return catrep.findById(c_id).orElseThrow()->
//		new ResourceNotFoundException("Categories", "c_id", c_id);
Optional<Categories> findById = catrep.findById(c_id);
         if(findById.isEmpty()) {
     // return findById.get();
        		new ResourceNotFoundException("Categories","c_id",c_id);

         }
          return findById.get();
}

	@Override
	public Categories updateCatg(Categories catg, int c_id) {
		//we need to check wherther given id is exist in db or not 
		Categories existCatgNot=catrep.findById(c_id).orElseThrow(
				()-> new ResourceNotFoundException("Categories","c_id",c_id));
		
		//existCatgNot.setC_id(catg.getC_id());
		existCatgNot.setC_name(catg.getC_name());
			
		//save existing database to db
			
		catrep.save(existCatgNot);
		return existCatgNot;

	}

	@Override
	public void deleteCatg(int c_id) {
		//check id is exists or not
		catrep.findById(c_id).orElseThrow(
				()-> new ResourceNotFoundException("Categories","c_id", c_id));
		catrep.deleteById(c_id);
	}

	

	
	}


