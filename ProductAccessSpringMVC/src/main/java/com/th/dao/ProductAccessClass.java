package com.th.dao;

import java.util.ArrayList;

import com.th.model.Product;

public class ProductAccessClass {

	// Repository is ---> ArrayList
	
	private static ArrayList<Product> plist = new ArrayList<Product>();
	
	public static String addProduct(Product product)
	{
		plist.add(product);
		return "Product added successfully !!!";
	}
	
	public static ArrayList<Product> getAllProducts()
	{
		return plist; 
	}
	
	public static Product getAProduct(int pId)
	{
		for (Product p:plist)
		{
			if (p.getpId()==pId)
				return p;
		}
		return null;
	}
	
	public static Product geAProduct(String pName)
	{
		for (Product p:plist)
		{
			if (p.getpName().equalsIgnoreCase(pName))
				return p;
		}
		return null;
	}
	
	public static String updateAProduct (int pId, int price)
	{
		Product product = getAProduct(pId);
		if (product != null)
		{
			product.setPrice(price);
			return ("Product price updated successfully !!!");
		}
		return ("OOPS !!! Product not found.");
	}
	
}
