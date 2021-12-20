package com.design.singleton.type3;

public class SingletonTest3 {

}

/**
 * 懒汉模式
 * 类装载的时候初始化实例对象
 * 优势：避免了内存浪费，第一次调用方法才创建对象
 * 不足：线程不安全，多个请求同时调用时，会产生多个实例
 * */
class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	//获取实例的方法
	//多线程会产生问题，多次实例化
	public static Singleton getSingleton(){
		//判断单例对象是否实例化了，没有实例化则实例化，最终对象只实例化一次
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
