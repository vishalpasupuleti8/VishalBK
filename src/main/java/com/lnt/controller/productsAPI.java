package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.products;
import com.lnt.service.productsService;

@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/products")
public class productsAPI {
	@Autowired
private productsService ProductsService;
	
	@RequestMapping
	public List<products> getAllproducts() {
		return ProductsService.getAllproductsService();
	}
	@RequestMapping("/{id}")
	public products findproductsById(@PathVariable int id) {
		return ProductsService.searchproductsByIdService(id);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT )
	public void updateproducts(@RequestBody products a,@PathVariable int id) {
	ProductsService.addproductsService(a);
	}
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public void addNewproducts(@RequestBody products a) {
		System.out.println(a.getproductName());
		ProductsService.addproductsService(a);
		
	}
}
