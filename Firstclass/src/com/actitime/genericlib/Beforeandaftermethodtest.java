package com.actitime.genericlib;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeandaftermethodtest {
@BeforeMethod
public void configBM(){
	System.out.println("login");
}
@Test
public void createcustomertest(){
	System.out.println("execute createcustomertest");
}
@Test
public void modifycustomertest(){
	System.out.println("execute modifycustomertest");
}
@AfterMethod
public void configAM(){
	System.out.println("logout");
}
}
