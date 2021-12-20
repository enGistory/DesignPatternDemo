package com.design.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws Exception {
		DeepProtoType deep = new DeepProtoType();
		deep.name="宋江";
		deep.deep=new DeepCloneableTarget("大牛","小牛");
		
		DeepProtoType clone1 = (DeepProtoType) deep.clone();
		
		DeepProtoType clone2 = (DeepProtoType) deep.deepClone();
		
		System.out.println(deep);
		System.out.println(clone1);
		System.out.println(clone2);
		System.out.println(clone2==deep);
		System.out.println(clone2==clone1);
		System.out.println(deep.deep==clone1.deep);
		System.out.println(deep.deep==clone2.deep);
		System.out.println(clone2.deep==clone1.deep);
	}
}
