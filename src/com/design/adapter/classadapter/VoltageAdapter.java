package com.design.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		int dstV = output220V();
		dstV=dstV/44;//转换220V为5V
		return dstV;
	}
}
