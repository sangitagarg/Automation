package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstwebdrivertest {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:\\gmail.com");
		WebElement ewb=driver.findElement(By.id("identifierId"));
		ewb.sendKeys("sangitagarg1992");
		WebElement bwb=driver.findElement(By.xpath("//span[text()='Next']"));
		bwb.click();
		Thread.sleep(2000);
		WebElement pwb=driver.findElement(By.name("password"));
		pwb.sendKeys("9631953617");
		WebElement b2wb=driver.findElement(By.xpath("//span[text()='Next']"));
		b2wb.click();
		Thread.sleep(1000);
		WebElement iwb=driver.findElement(By.xpath("//span[@class='gb_Aa gbii']"));
		iwb.click();
		Thread.sleep(1000);
		WebElement swb=driver.findElement(By.id("gb_71"));
		swb.click();
		driver.quit();
	}

}
