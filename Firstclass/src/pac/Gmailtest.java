package pac;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailtest {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	String exptitle="Gmail";
	String actpagetitle=driver.getTitle();
	System.out.println(actpagetitle);
	if(exptitle.equals(actpagetitle)){
		System.out.println("Login page is Displayed==>pass");
	}
	else{ System.out.println("Login page is not displayed==>fail");
	}

	}

}
