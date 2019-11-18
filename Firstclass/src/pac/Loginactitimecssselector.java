package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginactitimecssselector {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
        Thread.sleep(2000);
WebElement un=driver.findElement(By.cssSelector(".textField"));
un.sendKeys("admin");
Thread.sleep(2000);
WebElement pwd=driver.findElement(By.name("pwd"));
pwd.sendKeys("manager");
Thread.sleep(2000);
WebElement loginbtn=driver.findElement(By.cssSelector("#loginButton"));
loginbtn.click();
	}

}
