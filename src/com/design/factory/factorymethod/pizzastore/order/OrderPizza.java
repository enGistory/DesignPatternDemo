package com.design.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.design.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza  {
	
	abstract Pizza createPizza(String orderType);

	//订购披萨
	public void setFactory(){
		Pizza pizaa = null;
		String orderType = "";
		do {
			orderType = getType();
			Pizza pizza = createPizza(orderType);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
		
	}
	
	//订购的披萨类型
	public String getType(){
		try{
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			return strin.readLine();
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}
	}

}
