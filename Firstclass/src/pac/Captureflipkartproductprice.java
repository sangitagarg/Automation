package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captureflipkartproductprice {

	public static void main(String[] args) throws Throwable{
		String product="iphone 7";
		//String pname="Apple iPhone 7 (Black, 256 GB)";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//close the login hidden button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for i phone 7
		driver.findElement(By.name("q")).sendKeys(product,Keys.ENTER);
		//identify price element in gui
		String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Black, 256 GB)']/../../div[2]/div[1]/div/div[1]")).getText();
		Thread.sleep(2000);
		System.out.println(price);
	}

}
