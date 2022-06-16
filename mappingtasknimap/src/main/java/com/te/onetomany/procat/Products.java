package com.te.onetomany.procat;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Products {
	@Id
	private int p_id;
	private String p_name;
	private int p_qty;
	private int p_price;

public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public int getP_qty() {
	return p_qty;
}
public void setP_qty(int p_qty) {
	this.p_qty = p_qty;
}
public int getP_price() {
	return p_price;
}
public void setP_price(int p_price) {
	this.p_price = p_price;
}
public Products(String p_name, int p_qty, int p_price) {
	super();
	this.p_name = p_name;
	this.p_qty = p_qty;
	this.p_price = p_price;
}

}
 

