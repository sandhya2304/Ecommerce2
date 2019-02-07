package org.sandhya.Shopping.controller;

import org.sandhya.ShoppingBackend.dao.CategoryDao;
import org.sandhya.ShoppingBackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController
{
	
	@Autowired
	private CategoryDao categoryDao;
	
	
	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("title","welcome home page");
		
		//passing list of catgeoires;
		mv.addObject("categories",categoryDao.listAll());
		
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("title","contact ");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	/*
	 * manage all products based on category
	 */

	@RequestMapping(value="show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//passing list of catgeoires;
		mv.addObject("categories",categoryDao.listAll());
		
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value="show/category/{id}/products")
	public ModelAndView showProductByCategoryId(@PathVariable int id)
	{
		ModelAndView mv =new ModelAndView("page");
		
		//categorydao to fetch single category 
		Category category = null;
		
		category = categoryDao.get(id);
		mv.addObject("title",category.getName());
		
		//passing list of categories
		
		mv.addObject("categories",categoryDao.listAll());
	    
		//passing single category object
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	

}
