package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp10 {
   public WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.army.mil/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void gettitle()
	{
		String var =driver.getTitle();
		System.out.println("the title is:"+var);
	}
	public void getpagesrc()
	{
		String ca =driver.getPageSource();
		System.out.println("the src is:"+ca);
	}
	public void getcuurenturl()
	{
		String gis=driver.getCurrentUrl();
		System.out.println("the curl is:"+gis);
	}
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp10 obj =new SadbasicsExp10();
		obj.LaunchAUT();
		obj.gettitle();
		obj.getpagesrc();
		obj.getcuurenturl();

	}

}
