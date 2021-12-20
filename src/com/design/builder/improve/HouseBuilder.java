package com.design.builder.improve;

//抽象出建房子需要的所有步骤
public abstract class HouseBuilder {
	public House house = new House();
	
	//盖房子需要的步骤
	// 打地基
	public abstract void buildBasic();
	// 砌墙
	public abstract void buildWalls();
	// 封顶
	public abstract void roofed();
	
	public House build() {
		return house;
	}
}
