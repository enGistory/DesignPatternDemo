package com.design.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Cloneable,Serializable{
	private static final long serialVersionUID = 1L;
	public String name;
	public DeepCloneableTarget deep;
	public DeepProtoType() {
		super();
	}
	
	@Override
	public String toString() {
		return "DeepProtoType [name=" + name + ", deep=" + deep + "]";
	}

	//深拷贝1：clone()
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepProtoType deepProtoType = null;
		
		deepProtoType = (DeepProtoType) super.clone();
		deepProtoType.deep = (DeepCloneableTarget) deep.clone();
		return deepProtoType;
	}
	
	//序列化深克隆
	public Object deepClone() throws Exception {
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			//序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			
			//反序列化
			bais = new ByteArrayInputStream(baos.toByteArray());
			ois = new ObjectInputStream(bais);
			Object copyObj = ois.readObject();
			return copyObj;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}finally {
			ois.close();
			bais.close();
			oos.close();
			baos.close();
		}
		
	}
}
