package com.te.mapping;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.te.mapping.onetomany.Categories;
import com.te.mapping.onetomany.Product;
import com.te.mapping.onetomany.repository.CategoriesRepo;

@SpringBootApplication
public class NimapTaskMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NimapTaskMappingApplication.class, args);
	}

	@Autowired
	private CategoriesRepo catRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Categories c=new Categories("cloth");
		
		Product p1=new Product("shirt");
		Product p2=new Product("pant");
		Product p3=new Product("saree");

		c.getProd().add(p1);
		c.getProd().add(p2);
		c.getProd().add(p3);
		this.catRepo.save(c);
			}

}
