package Selenium12;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp14 {
	public WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Mr.jyoti please enter you are favorite browser");
		String browser =sc.nextLine();
		// this is first :we need to write condition
		if(browser.equals("c"))
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver =new ChromeDriver();
		
		}
		//second condition
		else if(browser.equals("F"))
		{

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver =new FirefoxDriver();
				
		}
		else
		{
			System.out.println("the browser is not found");
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void gettitle()
	{
		String var=driver.getTitle();
		System.out.println("the tiltle is:"+var);
	}
	public void currenturl()
	{
		String var=driver.getCurrentUrl();
		System.out.println("the url is:"+var);
		
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp14 obj =new SadbasicsExp14();
		obj.LaunchAUT();
		obj.gettitle();
		obj.currenturl();
		obj.closeAUT();

	}

}
