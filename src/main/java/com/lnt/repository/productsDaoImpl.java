package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lnt.domain.products;
@Repository
public class productsDaoImpl implements productsDao{
	@PersistenceContext // DI spring container injects EntityManager obj
	private EntityManager em;
	public List<products> getAllproducts() {
		// TODO Auto-generated method stub
		return em.createQuery("select a from products a",products.class).getResultList();
	}
	@Override
	public products searchproductsById(int id) {
		// TODO Auto-generated method stub
		return em.find(products.class, id);
	}
	@Override
	public void updateproducts(products a, int id) {
		products managedCopy=searchproductsById(id);
		managedCopy.setproductName(a.getproductName());
		managedCopy.setquantity(a.getquantity());
		managedCopy.setdescription(a.getdescription());;
		System.out.println("updated");
	}
	@Override
	public void addNewproducts(products a) {
		em.persist(a);
	}
	@Override
	public products searchproductsByIdService(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateproductsService(products a, int id) {
		// TODO Auto-generated method stub
		
	}
    
}
