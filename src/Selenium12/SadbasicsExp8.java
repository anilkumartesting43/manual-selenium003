package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp8 {

	public static void main(String[] args) throws InterruptedException {
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//create obj for driver
		WebDriver driver =new ChromeDriver();
		//load the website
		driver.get("https://www.youtube.com/");
		//wait for some time
		Thread.sleep(3000);
		//maximaize window
		driver.manage().window().maximize();
		//we get the page sourcecode
		String page_s=driver.getPageSource();
		System.out.println("the pagesource code is:"+page_s);
		//close the window
		driver.close();

	}

}
