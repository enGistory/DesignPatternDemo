package com.design.singleton.type6;

public class SingletonTest6 {

}

/**
 * 懒汉模式(线程安全，同步方法)
 * 类装载的时候初始化实例对象
 * 优势：线程安全，效率较高，延迟加载
 * 
 * */
class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	//获取实例的方法
	//多线程会产生问题，多次实例化
	public static Singleton getSingleton(){
		//双重校验，解决线程安全和懒加载，只有第一次实例化，后面进入会直接判断singleton==null来避免多次实例化
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
