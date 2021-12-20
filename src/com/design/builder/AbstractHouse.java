package com.design.builder;

public abstract class AbstractHouse {
	// 打地基
	public abstract void buildBasic();

	// 砌墙
	public abstract void buildWalls();

	// 封顶
	public abstract void roofed();

	// 建造顺序
	public void build() {// 传统方式，所有房子只能按照这个顺序来建造
		buildBasic();
		buildWalls();
		roofed();
	}

}
