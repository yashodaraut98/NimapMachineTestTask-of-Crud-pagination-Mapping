package com.te.mapping.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int c_id;
@Column(name="c_name")
private String c_name;
public Categories() {
	
}
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="cp_id",referencedColumnName = "c_id")
List<Product> prod=new ArrayList<>();
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public List<Product> getProd() {
	return prod;
}
public void setProd(List<Product> prod) {
	this.prod = prod;
}
public Categories(String c_name) {
	super();
	this.c_name = c_name;
}

}