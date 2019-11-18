package pac;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robotclasstest {

	private static final java.awt.Rectangle Rectangle = null;

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.indeed.co.in");
		
		driver.findElement(By.id("text-input-what")).sendKeys("manual testing",Keys.ENTER);
		driver.findElement(By.name("text-input-where")).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(By.xpath("//button=[text()='submit')]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Upload Resume')]")).click();
		
		
		//Store the location of the file in clipboard 
		//Clipboard
		 StringSelection strSel = new StringSelection("C:\\SeleniumResume.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		
		//Create an object for robot class
		Robot robot = new Robot();
		//Control key in the keyboard
		//Ctrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		 
		BufferedImage bufImage = robot.createScreenCapture(Rectangle);          
		File f = new File("indeedScreenshot.jpg");
		ImageIO.write(bufImage,"jpg", f);
			
		
	}
}
