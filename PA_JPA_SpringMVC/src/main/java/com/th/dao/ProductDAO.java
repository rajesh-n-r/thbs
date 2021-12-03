package com.th.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.th.model.Product;

public class ProductDAO {

	HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public String saveProduct(Product product) {
		template.save(product);
		return "Product inserted successfully !!!";
	}
	
}
