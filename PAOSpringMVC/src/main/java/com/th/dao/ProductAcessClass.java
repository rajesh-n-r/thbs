package com.th.dao;

import java.util.ArrayList;

import com.th.model.Product;

public class ProductAcessClass {
	
	private static ArrayList<Product> plist = new ArrayList<Product>();
	
 public  static String addProduct(int pId, String pName, int pPrice) {
		
		
		plist.add(new Product(pId,pName,pPrice));
		return "Product added successfully";
	}
	
 public  static Product searchProductById(int pId) {
				
		for (Product p:plist)
		{
			if (p.getpId()==pId)
				return(p);
		}
		return null;
	}

	
	public static ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return plist;
	}

	
	public  static Product searchProductByName(String pName) {
		// TODO Auto-generated method stub
		for (Product p:plist)
		{
			if (p.getpName().equalsIgnoreCase(pName))
				return(p);
		}
		return null;
	}

	
	public static String updateProductPrice(int pId, int pPrice) {
		
		Product product = searchProductById(pId);
		product.setpPrice(pPrice);
		return "Product price updated successfully...";
	}


}
