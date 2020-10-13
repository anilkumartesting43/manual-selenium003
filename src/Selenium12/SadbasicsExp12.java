package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp12 {
	public WebDriver driver;
	public void launchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void data() throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys("anilkumartesting43@gmail.com");
		//wait 
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys("anil1234@");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
	public void pagesrc()
	{
		String src =driver.getPageSource();
		System.out.println("the page source is:"+src);
		if(src.contains("please check username and password"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("the test case is faild");
			
			}
		}
	public void closeAUT()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp12 obj =new SadbasicsExp12();
		obj.launchAUT();
		obj.data();
		obj.pagesrc();
		obj.closeAUT();

	}

}
