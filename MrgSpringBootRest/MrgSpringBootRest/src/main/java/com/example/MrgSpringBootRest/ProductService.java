package com.example.MrgSpringBootRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
   public List<Product>findAll()
   {
	   ArrayList<Product>products=new ArrayList<>();
	   
	   //add Product to the list
	   
	   products.add(new Product(1001,"mobile1","mobilee1",1000.00,6));
	   products.add(new Product(1002,"mobile2","mobilee2",3000.00,7));
	   products.add(new Product(1001,"mobile3","mobilee3",6000.00,8));
	   return products;
   }
}
