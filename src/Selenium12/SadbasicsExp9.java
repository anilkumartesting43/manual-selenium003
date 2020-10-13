package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp9 {
	public void LaunchAUT() throws InterruptedException
	{
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//driver obj
		WebDriver driver=new ChromeDriver();
		//load the website
		driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			//max
	    driver.manage().window().maximize();
	    //get cuuretnt url
	    String ur=driver.getCurrentUrl();
	    System.out.println("the url is:"+ur);
	    //get pagesrc
	   // String src = driver.getPageSource();
	   // System.out.println("the pagesrc is:"+src);
	}

	
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp9 obj =new SadbasicsExp9();
		obj.LaunchAUT();
		

	}

}
