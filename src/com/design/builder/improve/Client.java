package com.design.builder.improve;

public class Client {
	public static void main(String[] args) {
		HouseDirector direct = new HouseDirector(new CommonHouse());
		
		//普通房子盖完
		House house = direct.contractHouse();
		
		//重置建造者
		HighBuilding highBuilding = new HighBuilding();
		direct.setHouseBuilder(highBuilding);
		//高楼盖房子
		House highHouse = direct.contractHouse();
		
	}
}
