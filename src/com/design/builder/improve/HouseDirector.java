package com.design.builder.improve;

//指挥官：主要来操作如何组合盖房的步骤，然后将完整的产品交出去
public class HouseDirector {
	private HouseBuilder houseBuilder;
	
	//传入一个房子构建的过程
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder=houseBuilder;
	}
	
	//注入一个构建房子的过程
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}


	public House contractHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.build();
	}
}
