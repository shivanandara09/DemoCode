package com.techgeek.testng;

public class BeanDataProvider {

	private String val;
	private int i;

	public  void getValue(String val) {
		this.val = val;
		System.out.println(val);
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

