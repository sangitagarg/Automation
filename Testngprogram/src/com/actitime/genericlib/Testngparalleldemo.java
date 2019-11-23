package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngparalleldemo {
 @Test
	public void test1() throws Exception {
		System.out.println("i am in test 1 |"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
 @Test
	public void test2() throws Exception {
		System.out.println("i am in test 2|"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.close();
	}	
}
