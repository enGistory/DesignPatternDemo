package com.design.factory.absfactory.pizzastore.order;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.util.Calendar;
import java.util.TimeZone;

import com.design.factory.absfactory.pizzastore.pizza.Pizza;


public class OrderPizza {
	public static void main(String[] args) throws Exception, IOException {
//		OrderPizza o = new OrderPizza(new BJFactory());
//		Calendar calendar = Calendar.getInstance();
		
//		System.out.println("时区："+System.getProperty("user.name")==null);
//		System.out.println("时区："+System.getProperty("java.home"));
//		
		try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(new FileInputStream(
                    new File("D:\\WorkInstallPosiion\\jre\\lib\\", "tzdb.dat"))))) {
			String groupId = dis.readUTF();
			System.out.println(groupId);
			
			int versionCount = dis.readShort();
			String versionId = null;
			System.out.println(versionCount);
	        for (int i = 0; i < versionCount; i++) {
	            versionId = dis.readUTF();
	            System.out.println(versionId);
	        }
	        System.out.println(versionId);
			
			int regionCount = dis.readShort();
			System.out.println(regionCount);
	        String[] regionArray = new String[regionCount];
	        for (int i = 0; i < regionCount; i++) {
	            regionArray[i] = dis.readUTF();
	        }
	        for (String string : regionArray) {
				System.out.println(string);
			}
			
       }
	}
	AbsFactory factory;
	
	Pizza pizaa = null;
	
	public OrderPizza(AbsFactory factory){
		setFactory(factory);
	}
	
	//根据具体实现工厂取获取披萨店
	public void setFactory(AbsFactory factory){
		String orderType = "";
		this.factory = factory;
		do {
			orderType = getType();
			Pizza pizza = factory.createPizza(orderType);
			if(pizza!=null){
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else{
				System.out.println("订餐失败");
				break;
			}
		} while (true);
		
	}
	
	//璁㈣喘鐨勬姭钀ㄧ被鍨�
	public String getType(){
		try{
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			return strin.readLine();
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}
	}
}
