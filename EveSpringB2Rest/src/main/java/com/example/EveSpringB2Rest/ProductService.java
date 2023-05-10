package com.example.EveSpringB2Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService 
{
   public List<Product>findAll()
   {
	   ArrayList<Product>products=new ArrayList<>();
	   //add product to the list
	   
	   products.add(new Product(1001,"mobile1","mobilee1",1000.00,6));
	   products.add(new Product(1002,"mobile2","mobilee2",2000.00,7));
	   products.add(new Product(1003,"mobile3","mobilee3",3000.00,8));
	   
	   return products;
   }
   
}
