package com.actitime.genericlib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeClass
	public void configBC(){
		System.out.println("=====LAUNCH THE BROWSER====");
	}
	@BeforeMethod
	public void configBM(){
		System.out.println("Login");
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
		System.out.println("Logout");
	}
	@AfterClass
	public void configAC(){
		System.out.println("===CLOSE THE BROWSER===");
	}
}
