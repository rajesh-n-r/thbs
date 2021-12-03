package com.th.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.th.dao.ProductAccessClass;
import com.th.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value="/addproduct", method=RequestMethod.GET)
	public ModelAndView getProductAddForm()
	{
		ModelAndView model = new ModelAndView("addproduct");
		return model;
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public ModelAndView submitAddProductForm(@ModelAttribute("product")Product product)
	{
		System.out.println("Product: "+product);
		String msg = ProductAccessClass.addProduct(product);
		ModelAndView model = new ModelAndView("addproduct");
		model.addObject("msg",msg);
		return model;
	}
	
	@RequestMapping(value="/getAllProducts", method = RequestMethod.GET)
	public String getAllProducts(Model model)
	{
		ArrayList<Product> plist = ProductAccessClass.getAllProducts();
		model.addAttribute("plist",plist);
		return ("getallproducts");
	}
	
	@RequestMapping(value="/searchproductbyid", method = RequestMethod.GET)
	public ModelAndView getProductSearchIdForm()
	{
		ModelAndView model = new ModelAndView("searchproductbyid");
		return model;
	}
	
	@RequestMapping(value="/searchproductbyid", method = RequestMethod.POST)
	public ModelAndView submitSearchProductIdForm(@RequestParam("pId")String pId)
	{
		
		Product product = ProductAccessClass.geAProduct(pId);
		ModelAndView model = new ModelAndView("searchproductbyid");
		model.addObject("product", product);
		return model;
		
		
	}
	
	@RequestMapping(value="/searchproductbyname", method = RequestMethod.GET)
	public ModelAndView getProductSearchNameForm()
	{
		ModelAndView model = new ModelAndView("searchproductbyname");
		return model;
	}
	
	@RequestMapping(value="/searchproductbyname", method = RequestMethod.POST)
	public ModelAndView submitSearchProductNameForm(@RequestParam("pName")String pName)
	{
		
		Product product = ProductAccessClass.geAProduct(pName);
		ModelAndView model = new ModelAndView("searchproductbyname");
		model.addObject("product", product);
		return model;
		
	}
	
	@RequestMapping(value="/updateproduct", method = RequestMethod.GET)
	public ModelAndView getProductupdateForm()
	{
		ModelAndView model = new ModelAndView("updateproduct");
		return model;
	}
	
	@RequestMapping(value="/updateproduct", method = RequestMethod.POST)
	public ModelAndView submitSearchUpdateForm(@RequestParam("pId") int pId, @RequestParam("price") int price)
	{
		
		String msg = ProductAccessClass.updateAProduct(pId, price);
		ModelAndView model = new ModelAndView("updateproduct");
		model.addObject("msg", msg);
		return model;
		
	}
	
}
