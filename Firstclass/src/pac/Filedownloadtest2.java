package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Filedownloadtest2 {

	public static void main(String[] args) throws Throwable {
		FirefoxOptions config=new FirefoxOptions();
		config.addPreference("browser.download.folderList", 2);
		config.addPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		config.addPreference("browser.download.useDownloadDir","C:\\Users\\user\\Desktop\\New folder");
		WebDriver driver=new FirefoxDriver(config);
		driver.get("https://maven.apache.org/download.cgi");
		driver.findElement(By.linkText("apache-maven-3.6.1-bin.zip")).click();
		Thread.sleep(3000);

	}

}
