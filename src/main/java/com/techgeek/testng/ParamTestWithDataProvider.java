package com.techgeek.testng;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider {
	BeanDataProvider myBean=new BeanDataProvider();
	
	@DataProvider(name = "test1")
	public static Iterator<String> getData() {
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		return obj.iterator();
	}

	@Test(dataProvider = "test1")
	public void testMethod(String val) {
		System.out.println("Value is "+val);
	}
}