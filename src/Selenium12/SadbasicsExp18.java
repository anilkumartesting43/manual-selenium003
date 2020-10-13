package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp18 {
	WebDriver driver;
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
 }
 public void Gettext() throws InterruptedException
 {
	 driver.findElement(By.linkText("Reset")).click();
	 Thread.sleep(2000);
	 String alert_msg=driver.switchTo().alert().getText();
	 System.out.println("the text msg is:"+alert_msg);
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
 }
 public void Senddata() throws InterruptedException
 {
	 driver.findElement(By.linkText("Reset")).click();
	 Thread.sleep(2000);
	 //send the data in input box
	 driver.switchTo().alert().sendKeys("jyoti.kandel@gmail.com");
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	 Thread.sleep(2000);
 }
 public void closeAUT()
 {
	 driver.close();
 }
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp18 obj =new SadbasicsExp18();
		obj.LaunchAUT();
		obj.Gettext();
		obj.Senddata();
		//obj.closeAUT();
		
	}

}
