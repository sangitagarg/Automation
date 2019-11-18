package pac;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DDTesting2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./testdata/new.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String USER=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		String BROWSER=pobj.getProperty("browser");
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		WebDriver driver=null;
		if(BROWSER.equals("firefox")){
			driver=new FirefoxDriver();
		}if(BROWSER.equals("chrome")){
			driver=new ChromeDriver();
			}if(BROWSER.equals("ie")){
			driver=new InternetExplorerDriver();
		}
       driver.get(URL);
       driver.findElement(By.name("username")).sendKeys(USER);
       driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
       driver.findElement(By.id("loginButton")).click();
		}
	}
