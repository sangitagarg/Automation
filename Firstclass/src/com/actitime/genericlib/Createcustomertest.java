package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Createcustomertest {

	public static void main(String[] args) throws Throwable {
		Filelib flib=new Filelib();
		String URL=flib.getpropertyfiledata("url");
		String USER=flib.getpropertyfiledata("username");
		String PASSWORD=flib.getpropertyfiledata("password");
		String BROWSER=flib.getpropertyfiledata("browser");
		String customername=flib.getExcelData("sheet1", 2, 4);
		System.out.println(customername);
		WebDriver driver=new FirefoxDriver();
		driver.get(URL);
	}

}
