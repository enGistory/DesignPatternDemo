package com.design.singleton.type8;


public class SingletonTest8 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE1;
		Singleton instance3 = Singleton.INSTANCE1;
		Singleton instance2 = Singleton.INSTANCE2;
		System.out.println(instance == instance2);
		System.out.println(instance == instance3);
		System.out.println(instance.getAAA());	
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		
		instance.sayOK();
	}
}

/**
 * 枚举
 * 类装载的时候初始化实例对象
 * 优势：避免线程不安全，延迟加载，效率高，防止反序列化重新创建新对象
 * 
 * */
enum Singleton {
	INSTANCE1("十天"),
	INSTANCE2("五天");
	private String aaa;
	public String getAAA() {
		return aaa;
	};
	public void sayOK(){
		System.out.println("ok~");
	}
	private Singleton(String aaa){
		this.aaa=aaa;
	}
}
