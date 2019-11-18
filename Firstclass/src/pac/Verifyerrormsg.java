package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifyerrormsg {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement wb=driver.findElement(By.id("username"));
		wb.sendKeys("admin");
		WebElement wb1=driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		wb1.sendKeys("manager");
		WebElement log=driver.findElement(By.id("loginButton"));
		log.click();
		Thread.sleep(2000);
		WebElement task=driver.findElement(By.xpath("//div[text()='TASKS']"));
		task.click();
		WebElement project=driver.findElement(By.linkText("Projects & Customers"));
		project.click();
		WebElement createcustomer=driver.findElement(By.xpath("//span[text()='Create Customer']"));
		createcustomer.click();
		WebElement cstname=driver.findElement(By.id("customerLightBox_nameField"));
		cstname.sendKeys("ICICI1");
		WebElement desc=driver.findElement(By.id("customerLightBox_descriptionField"));
		desc.sendKeys("Customer Information");
		WebElement save=driver.findElement(By.xpath("//span[text()='Create Customer']"));
		save.click();
		String cmsg="Customer with such name already exists";
		WebElement cmsg1=driver.findElement(By.id("customerLightBox_nameDuplicateError"));
		String amsg=cmsg1.getText();
		System.out.println(amsg);
		if(cmsg.contains(amsg)){
			System.out.println("Error msg displayed==>pass");}
			else
			{
		System.out.println("Error msg not displayed==>fail");
			}
	   String actcolor=cmsg1.getCssValue("color");
	   System.out.println(actcolor);
	   Dimension dim=cmsg1.getSize();
	   System.out.println(dim.getHeight());
	   System.out.println(dim.getWidth());
	   Point p1=cmsg1.getLocation();
	   System.out.println(p1.getX());
	   System.out.println(p1.getY());
	   driver.close();
	   
			}
	}

