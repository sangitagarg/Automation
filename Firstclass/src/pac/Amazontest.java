package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazontest {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:\\amazon.com");
		WebElement bwb=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		bwb.click();
		WebElement signin=driver.findElement(By.id("ap_email"));
		signin.sendKeys("9900012893");
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("sangi123.");
		WebElement log=driver.findElement(By.id("signInSubmit"));
		log.click();
		Thread.sleep(1000);
		WebElement bwb2=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		bwb2.click();
		WebElement logout=driver.findElement(By.xpath("//span[text()='Sign Out']"));
		logout.click();

	}

}
