package com.design.singleton.type2;

public class SingletonTest2 {

}

/**
 * 类装载的时候初始化实例对象
 * 优势：避免了线程安全问题
 * 不足：浪费内存
 * */
class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	static {
		singleton = new Singleton();
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
