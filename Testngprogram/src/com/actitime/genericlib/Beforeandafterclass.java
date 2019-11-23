package com.actitime.genericlib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeandafterclass {
	@BeforeClass
	public void configBC(){
		System.out.println("===START===");
	}
@Test
public void createcustomertest(){
	System.out.println("execute createcustomertest");
}
@Test
public void modifycustomertest(){
	System.out.println("execute modifycustomertest");
}
@AfterClass
public void configAC(){
	System.out.println("====END=====");
}
}
