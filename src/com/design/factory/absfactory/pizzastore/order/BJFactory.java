package com.design.factory.absfactory.pizzastore.order;

import com.design.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.design.factory.absfactory.pizzastore.pizza.Pizza;
import com.design.factory.absfactory.pizzastore.pizza.BJPepperPizza;

public class BJFactory implements AbsFactory{
	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")){
			pizza = new BJCheesePizza();
		}else if(orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
