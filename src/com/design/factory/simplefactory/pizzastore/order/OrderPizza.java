package com.design.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.design.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza  {
	
	public static void main(String[] args) {
		OrderPizza order = new OrderPizza(new SimpleFactory());
	}

	SimpleFactory simpleFactory;
	Pizza pizaa = null;
	
	public OrderPizza(SimpleFactory simpleFactory){
		setFactory(simpleFactory);
	}
	
	//订购披萨
	public void setFactory(SimpleFactory simpleFactory){
		String orderType = "";
		this.simpleFactory = simpleFactory;
		do {
			orderType = getType();
			Pizza pizza = this.simpleFactory.createPizza(orderType);
			if(pizza!=null){
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else{
				System.out.println("订购失败");
				break;
			}
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
