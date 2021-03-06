package com.design.factory.factorymethod.pizzastore.order;

import com.design.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.design.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.design.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")){
			pizza = new LDCheesePizza();
		}else if(orderType.equals("pepper")){
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
