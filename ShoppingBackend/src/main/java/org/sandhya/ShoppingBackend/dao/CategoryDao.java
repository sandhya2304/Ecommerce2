package org.sandhya.ShoppingBackend.dao;

import java.util.List;

import org.sandhya.ShoppingBackend.dto.Category;

public interface CategoryDao
{
	
	public List<Category> listAll();
	
	public Category get(int id);
	

}
