package com.design.factory.absfactory.pizzastore.order;

import com.design.factory.absfactory.pizzastore.pizza.Pizza;

//抽象工厂模式的抽象层接口
public interface AbsFactory {
	//提供方法让子类实现
	public Pizza createPizza(String orderType);
	
}
