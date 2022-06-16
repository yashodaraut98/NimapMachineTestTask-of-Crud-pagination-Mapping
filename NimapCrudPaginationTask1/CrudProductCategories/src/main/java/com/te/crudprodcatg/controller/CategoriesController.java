package com.te.crudprodcatg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.crudprodcatg.dao.CategoriesRepo;
import com.te.crudprodcatg.dto.Categories;
import com.te.crudprodcatg.service.CategoriesServicee;




@RestController
@RequestMapping(value="/api/catg")
public class CategoriesController {
	
	@Autowired
 private CategoriesServicee s;
	@Autowired
	CategoriesRepo d;

public CategoriesController(CategoriesServicee s) {
	super();
	this.s = s;
}
 //build create categories rest apis@
@PostMapping("/in")
public ResponseEntity<Categories> saveCatg(@RequestBody Categories catg){
	
	return new ResponseEntity<Categories>(s.save(catg), HttpStatus.CREATED);	

}
//build get all categories Rest Api
@GetMapping("/get")
public List<Categories>getAllcatg(){
	return s.getCatg();
	
}

//build get categories using particular id rest apis
//http://loaclhost:4567/api/catg/1;
@GetMapping("{c_id}")
public ResponseEntity<Categories>getByIdd(@PathVariable("c_id") int c_id ){
	return new ResponseEntity<Categories>(s.getById(c_id),HttpStatus.OK);
	
}
//build update Employee Rest Api
@PutMapping("{c_id}")
public ResponseEntity<Categories> updCatg(@PathVariable("c_id") int c_id, @RequestBody Categories catg){
	return new ResponseEntity<Categories>(s.updateCatg(catg, c_id),HttpStatus.OK);
	
}
//Build delete catg rest Api
@DeleteMapping("{c_id}")
public ResponseEntity<String>deletetcatgg(@PathVariable("c_id") int c_id){
	s.deleteCatg(c_id);
	return new ResponseEntity<String>("Employee deleted successfully!!!!",HttpStatus.OK);
	

}
////***********************pagination for Categories***************************
@GetMapping(value ="pagecatg")
public ResponseEntity<List<Categories>>getCategoriesPagination(@RequestParam int page,@RequestParam int size){
	org.springframework.data.domain.Pageable pageable=PageRequest.of(page, size);
	List<Categories>list=d.findAll(pageable).getContent();
	return ResponseEntity.ok(list);
	
}

}