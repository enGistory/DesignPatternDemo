package com.design.singleton.type4;

public class SingletonTest4 {

}

/**
 * 懒汉模式(线程安全，同步方法)
 * 类装载的时候初始化实例对象
 * 优势：线程安全，第一次的时候实例化
 * 不足：效率太低，多个请求都得进行同步
 * */
class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	//获取实例的方法
	//多线程会产生问题，多次实例化
	public static synchronized Singleton getSingleton(){
		//判断单例对象是否实例化了，没有实例化则实例化，最终对象只实例化一次
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
