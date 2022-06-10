package com.lnt.service;

import java.util.List;

import com.lnt.domain.products;

public interface productsService {
List<products> getAllproductsService();
void addproductsService(products a);
products searchproductsByIdService(int id);
void updateproductsService(products a,int id);
}
