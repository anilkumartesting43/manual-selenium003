package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp25 {
	WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void RightClick() throws InterruptedException
	{
		//find locate element\
		WebElement we =driver.findElement(By.xpath("//span[contains(text(),'About Us')]"));
		Actions actobj =new Actions(driver);
		//Right click
		actobj.contextClick(we).perform();
		Thread.sleep(2000);
	}
	public void CLoseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp25 obj =new SadbasicsExp25();
		obj.LaunchAUT();
		obj.RightClick();
		//obj.CLoseAUT();
		
	}

}
