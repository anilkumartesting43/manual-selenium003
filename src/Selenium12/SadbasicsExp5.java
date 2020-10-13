package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp5 {
	
	public static void main(String[] args) throws InterruptedException {
	//launch the website here we need driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//we need to create obj
		WebDriver driver =new ChromeDriver();
		//load the site
		driver.get("https://login.salesforce.com/?locale=in");
		//wait for some time
		Thread.sleep(3000);
		//maximize window
		driver.manage().window().maximize();
		//get the title
		String act_out=driver.getTitle();
		String ex_out ="Login | Salesforce";
		if(act_out.equals(ex_out))
		{
			System.out.println("the title is pass");
		}
		else
		{
			System.out.println("the title is faild");
		}
		
			
		
	}
		
	}
