package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovetest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement dwb=driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions act=new Actions(driver);
		act.moveToElement(dwb);
		act.perform();
		driver.findElement(By.xpath("//span[text()='Books']")).click();
	}

}
