package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import model.Book;

import model.BookDAO;



@Controller
public class Bookcontroller {
	@Autowired
	BookDAO dao;
	
	@RequestMapping(value="/addbook",method = RequestMethod.GET)
	public ModelAndView getForm(){
		
		ModelAndView model = new ModelAndView("addbook");
		return model;
	}
	
	@RequestMapping(value="/addbook",method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("book") Book book){
		  
		
		String msg = dao.saveBook(book);
		ModelAndView model = new ModelAndView("addbook");
		model.addObject("msg",msg);
		
		return model;
	}
	
	

	@RequestMapping(value="/getallbooks",method = RequestMethod.GET)
	public ModelAndView getAllProducts(){		
		ArrayList<Book> blist = (ArrayList<Book>) dao.getBooks();
		ModelAndView model = new ModelAndView("getallbooks");		
		model.addObject("blist",(ArrayList<Book>)blist);		
		return model;
	}
	
	
	
	@RequestMapping(value="/updatebook",method = RequestMethod.GET)
	public ModelAndView updateForm(){
		
		ModelAndView model = new ModelAndView("updatebook");
		return model;
	}
	
	
	@RequestMapping(value="/updatebook",method = RequestMethod.POST)
	public ModelAndView Submitupdate(@RequestParam("bookid") int bookid, @RequestParam("bookprice") int bookprice){
		  
		Book book = dao.getById(bookid);
		book.setBookprice(bookprice);
		String msg = dao.updatebook(book);
		ModelAndView model = new ModelAndView("updatebook");
		model.addObject("msg",msg);
		
		return model;
	}

}
