package com.design.adapter.classadapter;

public class client {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
		
	}
}
