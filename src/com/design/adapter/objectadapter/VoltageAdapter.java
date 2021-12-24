package com.design.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V{
	private Voltage220V voltage220V = new Voltage220V();
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V=voltage220V;
	}
	@Override
	public int output5V() {
		int dstV = voltage220V.output220V();
		dstV=dstV/44;//转换220V为5V
		return dstV;
	}
}
