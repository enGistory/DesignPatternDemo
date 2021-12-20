package com.design.prototype.improve;

public class Client {
	public static void main(String[] args) throws Exception {
		Sheep sheep = new Sheep("tom",1,"白色");
		sheep.setFriend(new Sheep("jack",2,"黑色"));
		//浅克隆，外层复制的是对象的数据，内层对象会复制的是对象引用
		
		Sheep sheep2 = (Sheep) sheep.clone();
		sheep.getFriend().setAge(3);
		System.out.println("1:"+sheep);
		System.out.println("1:"+sheep.getFriend());
		System.out.println("2:"+sheep2.getFriend());
		System.out.println("2:"+sheep2);
		
		System.out.println(sheep==sheep2);//false
		System.out.println(sheep.getFriend()==sheep2.getFriend());//true
		
	}
}
