package com.design.prototype.improve;


/**
 * @author admin
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private int age;
	private String color;
	private String address = "蒙古羊";
	private Sheep friend;//克隆对象
	public Sheep(String name,int age,String color) {
		super();
		this.name=name;
		this.age=age;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + ", friend="
				+ friend + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Sheep getFriend() {
		return friend;
	}
	public void setFriend(Sheep friend) {
		this.friend = friend;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep = null;
		try{
			sheep = (Sheep) super.clone();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return sheep;
	}
	
}
