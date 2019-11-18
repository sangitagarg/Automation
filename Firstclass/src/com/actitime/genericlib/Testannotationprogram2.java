package com.actitime.genericlib;

import org.testng.annotations.Test;

public class Testannotationprogram2 {
	@Test
	public void createcustomertest(){
		System.out.println( "execute createcustomertest");
		int[] arr={1,2};
		System.out.println(arr[3]);
	}
	@Test(dependsOnMethods="createcustomertest")
	public void modifycustomertest(){
		System.out.println("execute modifycustomertest");
	}
	}
