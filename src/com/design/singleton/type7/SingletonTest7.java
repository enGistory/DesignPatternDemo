package com.design.singleton.type7;

public class SingletonTest7 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
		
			new Thread(() -> {
				System.out.println(Singleton.getSingleton());
			},"aaa").run();
			
		}
	}
}

/**
 * 静态内部类
 * 类装载的时候初始化实例对象
 * 优势：避免线程不安全，延迟加载，效率高
 * 
 * */
class Singleton {
	private static volatile Singleton singleton;
	
	private Singleton(){
		
	}
	
	static {
		System.out.println(111);
	}
	
	private static class SingletonInstance{
		private static final Singleton SINGLETON = new Singleton();
		
		static {
			System.out.println(222);
		}
	}
	
	//直接返回对象
	public static Singleton getSingleton(){
		return SingletonInstance.SINGLETON;
	}
}
