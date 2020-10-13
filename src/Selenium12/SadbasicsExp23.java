package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp23 {
	WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void doubleClick() throws InterruptedException
	{
		driver.switchTo().frame("iframeResult");
		//locater 
		WebElement we=driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		Actions actobj =new Actions(driver);
		actobj.doubleClick(we).perform();
		Thread.sleep(2000);
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp23 obj =new SadbasicsExp23();
		obj.LaunchAUT();
		obj.doubleClick();
		//obj.closeAUT();
	}

}
