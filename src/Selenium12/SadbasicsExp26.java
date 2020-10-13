package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp26 {
	WebDriver driver;
	JavascriptExecutor jsobj;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void Senddata() throws InterruptedException
	{
		//find element
		//driver.findElement(By.id("username")).sendKeys("anilkumartesting43@gmail.com");
		//clear that field
		driver.findElement(By.id("username")).clear();
		WebElement we=driver.findElement(By.id("username"));
		jsobj =(JavascriptExecutor)driver;
		jsobj.executeScript("arguments[0].value='jyotikandel@gmail.com';", we);
		Thread.sleep(2000);
		
	}
	public void Highlight() throws InterruptedException
	{
		//driver.findElement(By.id("username")).sendKeys("anilkumartesting43@gmail.com");	
		driver.findElement(By.id("password")).clear();
		WebElement we1=driver.findElement(By.id("password"));
		jsobj =(JavascriptExecutor)driver;
		jsobj.executeScript("arguments[0].value='jyoti12345';", we1);
		Thread.sleep(2000);
		jsobj.executeScript("arguments[0].style='border:5px dotted red';", we1);
		Thread.sleep(2000);	
	}
	public void Submit() throws InterruptedException 
	{
		//find element
		WebElement we2=driver.findElement(By.id("Login"));
		jsobj.executeScript("arguments[0].click();", we2);
		Thread.sleep(2000);
	}
	public void CloseAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp26 obj =new SadbasicsExp26();
		obj.LaunchAUT();
		obj.Senddata();
		obj.Highlight();
		obj.Submit();
		obj.CloseAUT();
		

	}

}
