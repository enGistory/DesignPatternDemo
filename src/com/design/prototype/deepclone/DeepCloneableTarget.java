package com.design.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	private String cloneName;
	private String cloneClass;
	public String getCloneName() {
		return cloneName;
	}
	public void setCloneName(String cloneName) {
		this.cloneName = cloneName;
	}
	public String getCloneClass() {
		return cloneClass;
	}
	public void setCloneClass(String cloneClass) {
		this.cloneClass = cloneClass;
	}
	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		super();
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}
}
