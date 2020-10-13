package Selenium12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp21 {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en/demo");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void Adminarea() throws InterruptedException
{
	//store parent window handle
	String p_handle=driver.getWindowHandle();
	System.out.println("parent window handle is:"+p_handle);
	driver.findElement(By.xpath("//span[contains(text(),'Admin area')]")).click();
	Thread.sleep(2000);
	//get all window handles
	Set<String>all_windows=driver.getWindowHandles();
	for(String handle:all_windows)
	{
		if(!handle.equals(p_handle)) {
			System.out.println("this is child window");
			//switch to child window
			driver.switchTo().window(handle);
			//automate login form element
			driver.findElement(By.name("Email")).clear();
			driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(2000);
		}
	}
}
	

	
	public void CloseAUT()
	{
		driver.quit();
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp21 obj =new SadbasicsExp21();
		obj.LaunchAUT();
		obj.Adminarea();
		obj.CloseAUT();
	}

}
