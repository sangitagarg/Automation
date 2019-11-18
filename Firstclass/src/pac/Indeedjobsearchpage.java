package pac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Indeedjobsearchpage {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.indeed.com/jobs?st=&psf=advsrch&fromage=7&as_phr=&jt=all&sort="
                + "date&salary=&l=Bellevue%2C+WA&as_and=qa+engineer&as_not%22++%22=&as_any=&as_ttl="
                + "&limit%22++%22=10&as_cmp=&radius=5");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //close pop up window

        try{
            driver.findElement(By.id("prime-popover-close-button")).click();
        }
        catch(Exception e)
        {

        }
        //Count number of pages

        List<WebElement> search_pages=driver.findElements(By.xpath("//span[contains(@class,'pn')]"));
        System.out.println("Number of pages found for this search " + search_pages.size());

        int job_count=0;
        int page_count=0;

        while(search_pages.size()!=0){
            //Get job title
            List<WebElement>    job_title=driver.findElements(By.xpath("//a[contains(@data-tn-element,'jobTitle')]"));  

            //Get job description
            driver.findElements(By.xpath("//div [contains(@id,'p')][contains(@class,'row')]"));
            for(WebElement e: job_title){
                String str_job_title= e.getText();
                if(str_job_title.contains("Quality")){
                    System.out.println(str_job_title);
                    job_count++;

                }           }

            //scroll down
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,1000)", "");

            //the following list is keeping track of Next link
            List<WebElement> next_page=driver.findElements(By.xpath("//span[contains(@class,'np')][contains(text(),'Next')]"));
            if(next_page.size()>0){
                driver.findElement(By.xpath("//span[contains(@class,'np')][contains(text(),'Next')]")).click(); 
                page_count++;

                System.out.println("Page number is " + page_count + " number of jobs found " + job_count);
            }

            else{
                page_count++;
                //using page count++ to get a count number printed of the last page
                System.out.println("Page number is " + page_count + " number of jobs found " + job_count);
                System.out.println("End of search");
                break;
            }

        }
	}
}
