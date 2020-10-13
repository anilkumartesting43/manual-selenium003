package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp24 {
WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void SearchTc01() throws InterruptedException
	{
		//locate the element
		WebElement we1=driver.findElement(By.id("twotabsearchtextbox"));
		//actions obj
		Actions actobj=new Actions(driver);
		actobj.sendKeys(we1, "software testing").perform();
		//pressdown arrow 7times
		/*actobj.sendKeys(Keys.DOWN).perform();
		actobj.sendKeys(Keys.DOWN).perform();
		actobj.sendKeys(Keys.DOWN).perform();
		actobj.sendKeys(Keys.DOWN).perform();
		actobj.sendKeys(Keys.DOWN).perform();*/
		for(int i=0; i<=7; i++)
		{
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		//press enter
		actobj.sendKeys(Keys.ENTER).perform();
		
	}
	public void closeAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp24 obj =new SadbasicsExp24();
		obj.LaunchAUT();
		obj.SearchTc01();
		//obj.closeAUT();

	}

}
