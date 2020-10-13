package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp22 {
	WebDriver driver;
	 Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//handle popup actions
		 actobj =new Actions(driver);
		 //press escape key from keybord
		 actobj.sendKeys(Keys.ESCAPE).perform();
		 Thread.sleep(2000);
	}
	public void GettestTc01()
	{
	 String Act_out=driver.getTitle();
	 System.out.println("the title is:"+Act_out);
	 String Exp_out ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	 if(Act_out.equalsIgnoreCase(Exp_out))
	 {
		 System.out.println("the title is pass");
	 }
	 else
	 {
		 System.out.println("the title is faild");
	 }
	 
	}
	public void SerchTco2() throws InterruptedException
	{
		//this is trditional way
		//driver.findElement(By.name("q")).sendKeys("Iphone");
		//sending data using actions
		WebElement serch_elment=driver.findElement(By.name("q"));
		actobj.sendKeys(serch_elment, "Iphone").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='vh79eN']//*[local-name()='svg']")).click();
		String Act_ot=driver.getTitle();
		if(Act_ot.contains("Iphone"))
		{
			System.out.println("search title test case pass");
		}
		else
		{
			System.out.println("search title test case is faild");
		}
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp22 obj =new SadbasicsExp22();
		obj.LaunchAUT();
		obj.GettestTc01();
		obj.SerchTco2();
		//obj.closeAUT();
	}

}
