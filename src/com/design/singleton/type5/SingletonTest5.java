package com.design.singleton.type5;

public class SingletonTest5 {

}

/**
 * 懒汉模式(线程安全，同步代码块)
 * 类装载的时候初始化实例对象
 * 优势：线程安全
 * 不足：多个线程同时进入会发生多次实例
 * */
class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	//获取实例的方法
	//多线程会产生问题，多次实例化
	public static Singleton getSingleton(){
		if(singleton==null){
			synchronized(Singleton.class){
				//多个请求进入会进行多次实例化，第一层校验已经过滤掉了
				singleton = new Singleton();
			}
		}
		
		
		return singleton;
	}
}
