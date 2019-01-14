package com.techgeek.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class GroupTestExample {

String message = "techgeek";

@Test(groups = { "functest", "checkintest" })
public void testPrintMessage() {
   System.out.println("Inside testPrintMessage()");
   //Assert.assertEquals(message, "hello-1");
}

@Test(groups = "checkintest")
public void testSalutationMessage() {
   System.out.println("Inside testSalutationMessage()");
  //  Assert.assertEquals(message, "hello-2");
}

@Test(groups = "functest")
public void testingExitMessage() {
   System.out.println("Inside testExitMessage()");
  // Assert.assertEquals(message, "hello-3");
}  
}