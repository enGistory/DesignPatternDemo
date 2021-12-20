package com.design.factory.absfactory.pizzastore.order;

import com.design.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.design.factory.absfactory.pizzastore.pizza.Pizza;
import com.design.factory.absfactory.pizzastore.pizza.LDPepperPizza;

public class LDFactory implements AbsFactory{
	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")){
			pizza = new LDCheesePizza();
		}else if(orderType.equals("pepper")){
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
