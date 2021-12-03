package com.th.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.th.dao.ProductAcessClass;
import com.th.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value="/addproduct",method = RequestMethod.GET)
	public ModelAndView getForm(){
		
		ModelAndView model = new ModelAndView("addproduct");
		return model;
	}
	
	@RequestMapping(value="/addproduct",method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("product") Product product){
		  
		System.out.println(product.getpId());
		int pId = product.getpId();
		String pName = product.getpName();
		int  pPrice = product.getpPrice();
		//System.out.println("local pid "+pId);
		String msg = ProductAcessClass.addProduct(pId,pName,pPrice);
		ModelAndView model = new ModelAndView("addproduct");
		model.addObject("msg",msg);
		
		return model;
	}
	
	@RequestMapping(value="/getallproducts",method = RequestMethod.GET)
	public String getProducts(Model model){
		  
		
		ArrayList<Product> plist = ProductAcessClass.getAllProducts();
		System.out.println(plist);
		
		
		/*ModelAndView model = new ModelAndView("getallproducts");
		model.addObject("plist",plist);
		
		return model;*/
		model.addAttribute("plist",plist);
		
		return "getallproducts";
		
		
	}

}
