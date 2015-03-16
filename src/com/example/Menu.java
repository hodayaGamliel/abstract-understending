package com.example;

import com.example.Meat;
import com.example.Cake;
import com.example.Food;

public class Menu 
{
	 public static void main(String[] args) throws Exception 
	 {
      			System.out.println("1");
				Food fd = new Cake();
				fd.print();	
				fd.price();
				
      			System.out.println("2");
				Food fd2 = new Meat();
				fd2.print();
				fd2.price();	
	 }
}
