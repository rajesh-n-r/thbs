package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;





public class BookDAO {
	
	HibernateTemplate template;  
	


	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	//method to save book  
	public String saveBook(Book b){  
	    template.save(b); 
	    return "Book inserted successfully!!";
	}  
	//method to update book  
	public String updatebook(Book b){  
	    template.update(b);
	    return "Book updated successfully!!";
	}  
	//method to delete book  
	public void deletebook(Book b){  
	    template.delete(b);  
	}  
	//method to return one book of given id  
	public Book getById(int id){  
	    Book b=(Book)template.get(Book.class,id);  
	    return b;  
	}  
	//method to return all Books  
	public List<Book> getBooks(){  
	    List<Book> list=new ArrayList<Book>();  
	    list=template.loadAll(Book.class);  
	    return list;  
	}  
	
	
	}  
	
