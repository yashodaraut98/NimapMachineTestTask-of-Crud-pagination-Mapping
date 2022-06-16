package com.te.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.onetomany.dao.CatgRepo;
import com.te.onetomany.procat.Categories;
@Service
public class ServiceImpl implements Servicee{
@Autowired
private CatgRepo cd;
@Autowired
//	@Override
//	public Categories save(Categories catg) {
//		return cd.save(catg);
//}
@Override
public List<Categories> getCatg() {
	return cd.findAll();
}
@Override
public Categories save(Categories catg) {
	
	return cd.save(catg);
}

//	@Override
//	public List<Categories> getCatg() {
//		
//		return cd.findAll();
//	}
	

}
