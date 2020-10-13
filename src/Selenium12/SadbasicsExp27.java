package Selenium12;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp27 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nytimes.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void ScrollTopBottom() throws InterruptedException
	{
		jse=(JavascriptExecutor)driver;
		//scroll to bottom
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll to top
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
	}
	public void RefreshPage()
	{
		//driver.navigate().refresh();
		//using js
		jse.executeScript("history.go(0);");
		
	}
	public void getinnertext()
	{
		String innertext=jse.executeScript("return document.documentElement.innerText").toString();
		System.out.println("the innerText is:"+innertext);
	}
	public void getTitle()
	{
		//driver.getTitle();
		String title =jse.executeScript("return document.title;").toString();
		

		System.out.println("the title is:"+title);
	}
	public void closeAUT()
	{
	 driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp27 obj =new SadbasicsExp27();
		obj.LaunchAUT();
		obj.ScrollTopBottom();
		obj.RefreshPage();
		obj.getinnertext();
		obj.getTitle();
		obj.closeAUT();
	}

}
