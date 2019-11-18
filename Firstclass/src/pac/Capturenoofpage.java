package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturenoofpage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("lallantop", Keys.ENTER);
		int count=0;
		while(count<10)
			try{
		//capture no of pages
		driver.findElement(By.xpath("//a[contains(@aria-label,'Page' )]")).click();
		break;}
		catch(Throwable t){
			System.out.println("ignore and try again");
			count++;
		}
	}
}

