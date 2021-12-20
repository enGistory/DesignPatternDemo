package com.design.factory.simplefactory.pizzastore.order;

import com.design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.design.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.design.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

	//根据orderType来区分创建哪个对象
	public Pizza createPizza(String orderType){
		Pizza pizza = null;
		if(orderType.equals("greek")){
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		}else if(orderType.equals("cheese")){
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		}else if(orderType.equals("pepper")){
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}
	
	//简单工厂模式
	public static Pizza createPizza2(String orderType){
		Pizza pizza = null;
		if(orderType.equals("greek")){
			pizza.setName("希腊披萨");
			pizza = new GreekPizza();
		}else if(orderType.equals("cheese")){
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		}else if(orderType.equals("pepper")){
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}
}
