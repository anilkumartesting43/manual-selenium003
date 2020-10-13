package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp13 {
	public WebDriver driver;
	
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize(); 
 }
  public void fillloginfrom(String username, String password) throws InterruptedException
  {
	  driver.findElement(By.id("username")).sendKeys(username);
	  Thread.sleep(2000);
	  driver.findElement(By.name("pw")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.id("Login")).click();  
  }
  public void gettitle()
  {
	  String sam =driver.getTitle();
	  System.out.println("the title is:"+sam);
  }
  public void closeAUT()
  {
	  driver.close();
  }
  
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp13 obj =new SadbasicsExp13();
		obj.LaunchAUT();
		obj.fillloginfrom("jyoti.kandel@gmail.com", "jyoti12345");
		//obj.fillloginfrom("anilhopparapu@gmail.com", "anil12345");
		//obj.fillloginfrom("anilchopparapu@gmail.com", "anil12345@");
		//obj.fillloginfrom("chinnichopparapu", "chinni12345@");
		obj.gettitle();
		//obj.closeAUT();
		

	}

}
