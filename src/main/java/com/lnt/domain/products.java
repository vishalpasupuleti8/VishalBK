package com.lnt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="vishal_products")
public class products {
	@Id
	@GeneratedValue
private int id;

private String productName;
private int quantity;
private String description;

public products() {
	// TODO Auto-generated constructor stub
}


public products(int id, String productName,int quantity, String description) {
	super();
	this.id = id;
	this.productName = productName;
	this.quantity = quantity;
	this.description = description;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getproductName() {
	return productName;
}
public void setproductName(String productName) {
	this.productName = productName;
}
public int getquantity() {
	return quantity;
}
public void setquantity(int quantity) {
	this.quantity = quantity;
}

public String getdescription() {
	return description;
}
public void setdescription(String description) {
	this.description = description;
}

}
