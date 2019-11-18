package pac;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowsmethods {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:\\www.amazon.com");
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		Dimension dem=new Dimension(100,400);
		driver.manage().window().setSize(dem);
		driver.manage().window().maximize();
		driver.close();
	
	}
}
