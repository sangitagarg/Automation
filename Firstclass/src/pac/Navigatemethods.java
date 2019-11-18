package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigatemethods {
	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver= new FirefoxDriver();
		driver.navigate().to("https:\\www.amazon.com");
		driver.findElement(By.linkText("Your Amazon.com")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		
	}

}
