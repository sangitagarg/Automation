package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookverify {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
String actToolTip=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']")).getAttribute("title");
if(actToolTip.equals("Go to Facebook home")){
	System.out.println("Tool Tip is verified==> PASS");
	}
else
{
	System.out.println("Tool Tip is not verified==> FAIL");
}
boolean imagestat=driver.findElement(By.xpath("(//img[@class='img'])[1]")).isDisplayed();
if(imagestat){
	System.out.println("image is displayed==>PASS");}
else{
	System.out.println("image is not displayed==>FAIL");
}
boolean radio1=driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
boolean radio2=driver.findElement(By.xpath("(//input[@name='sex'])[2]")).isSelected();
boolean radio3=driver.findElement(By.xpath("(//input[@name='sex'])[3]")).isSelected();
if(radio1||radio2||radio3)
{
	System.out.println("is selected==fail");
}
else {
	System.out.println("is deselected==pass");
}
driver.close();
	}
}
