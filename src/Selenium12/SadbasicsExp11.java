package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp11 {
	public WebDriver driver;
	public void LaunchAUT() throws InterruptedException

	{
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//driver obj
		 driver=new ChromeDriver();
		//load
		driver.get("https://login.salesforce.com/");
		//waait
		Thread.sleep(2000);
		//maxi
		driver.manage().window().maximize();
		
	}
	public void fillloginform() throws InterruptedException
	{
		//locaters
		driver.findElement(By.id("username")).sendKeys("jyoti.kandel@gmail.com");
		//wait
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("jyoti@12345");
		 driver.findElement(By.name("Login")).click();
	}
	public void closeAUT()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp11 obj = new SadbasicsExp11();
		obj.LaunchAUT();
		obj.fillloginform();
		//obj.closeAUT();

	}

}
