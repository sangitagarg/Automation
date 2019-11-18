package pac;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewTab {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 7",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Black, 256 GB)']")).click();
		Thread.sleep(2000);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parentwinId=it.next();
		String childwinId=it.next();
		driver.switchTo().window(childwinId);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']")));
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentwinId);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
