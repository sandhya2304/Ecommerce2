package org.sandhya.ShoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.sandhya.ShoppingBackend.dao.CategoryDao;
import org.sandhya.ShoppingBackend.dto.Category;
import org.springframework.stereotype.Repository;



@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao
{
	
	private static List<Category> categories = new ArrayList<>();
	
	static
	{
		
		Category category = new Category();
		category.setId(1);
		category.setName("Shopping");
		category.setImageUrl("shop.png");
		category.setDescription("this is related to shopping category");
		category.setActive(true);
		
		categories.add(category);
		
		//second
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Shopping 2");
		category2.setImageUrl("shop 2.png");
		category2.setDescription("this is related to shopping 2 category");
		category2.setActive(true);
		
		categories.add(category2);
		
	}
	

	@Override
	public List<Category> listAll() 
	{	
		return categories;
	}


	@Override
	public Category get(int id)
	{
		
		for(Category category : categories)
		{
			if(category.getId() == id)
			{
				return category;
			}	
		}
		return null;
	}
	

}
