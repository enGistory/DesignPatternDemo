package com.design.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		AbsAdapter adapter = new AbsAdapter() {
			public void m1() {
				System.out.println("aaa");
			}
		};
		adapter.m1();
	}
}
