package com.techgeek.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnaotation {
	
	@Test       
	@Parameters({"url","userid"})   //it should be same as parameter tab name attributes in testng.xml file  
	public void parameterTest(String url1, String userid1) { //we should pass parameter as @parameters
	System.out.println("Parameterized url value is: " + url1);
	System.out.println("Parameterized user id value is : " + userid1); //it also example for data driven 
	}
}
