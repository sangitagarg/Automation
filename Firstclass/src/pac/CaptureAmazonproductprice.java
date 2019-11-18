package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAmazonproductprice {

	public static void main(String[] args) throws InterruptedException {
		String product="iphone 8";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product, Keys.ENTER);
		String price=driver.findElement(By.xpath("//span[text()='Apple iPhone 8 (64GB) - Gold']/../../../h2||//span[contains(@text()='₹')]")).getText();
	    Thread.sleep(2000);
		System.out.println(price);
	
	}
	

}
