// to save data insert data for one to Many mapping in ***postman*** using sts and featch data with respect to categories products

package com.te.onetomany.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.onetomany.procat.Categories;
import com.te.onetomany.procat.Products;
import com.te.onetomany.service.Servicee;


@RestController
@RequestMapping(value="/api/onetomany")
public class HandlerController {
//	@Autowired
//	private CatgRepo cr;
//	@Autowired
//	private ProdRepo pr;
//	
	private Servicee s;

	public HandlerController(Servicee s) {
		super();
		this.s = s;
	}
	@PostMapping(value = "/in")
	public ResponseEntity<Categories>save(@RequestBody Categories catg){
		return new ResponseEntity<Categories>(s.save(catg),HttpStatus.OK);
		
	}
	
	//build get all Product Rest Api
	@GetMapping("/get")
	public List<Categories>getCatgAll(){
		return s.getCatg();
		
	}

	}


// to save data insert data for one to Many mapping in postman using sts and featch data with respect to categories products
///{
//	"Categories":{
//	    "c_name":"cloths",
//	    "Products":[
//	        {
//	        
//	            "p_name":"sweater",
//	            "p_qty":"8",
//	            "p_price":"800"
//	        },
//	        {
//	            "p_name":"shirt",
//	            "p_qty":"2",
//	            "p_price":"900"
//	        }
//	    ]
//	    }
//	    }
//
//
//	// pm.visualizer.set(template,{
////	     response:pm.response.json()
//	// });
//
//
//
