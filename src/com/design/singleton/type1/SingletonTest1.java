package com.design.singleton.type1;


public class SingletonTest1 {
	
}

/**
 * 饿汉模式，在加载的时候就初始化实例对象，
 * 优势：避免了线程安全问题
 * 不足：浪费内存
 * */
class Singleton {
	private static Singleton singleton = new Singleton();
	
	//私有构造器，使该类无法从外部实例化
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
