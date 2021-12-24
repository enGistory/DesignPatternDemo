package com.design.adapter.objectadapter;

public class Phone {
	public void charging(IVoltage5V voltage5V){
		int dstV = voltage5V.output5V();
		if(dstV==5) {
			System.out.println("正在充电");
		}else if(dstV>5){
			System.out.println("电压过大，无法充电");	
		}
	};
}
