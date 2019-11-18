package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarWindow {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		int count=0;
		while(count<12)
			try{
				String x="//div[contains(@aria-label,'Mar 21 2020')]/div/p[text()='21']";
			    driver.findElement(By.xpath(x)).click();
				break;
			}
		catch(Throwable t){
			System.out.println("ignore and try again....");
			driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
			count++;
				
		}
		

	}

}
