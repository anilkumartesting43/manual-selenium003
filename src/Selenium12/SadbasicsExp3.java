package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp3 {

	public static void main(String[] args) {
	//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//driver object
		WebDriver driver=new ChromeDriver();
		//load the website
		driver.get("https://www.amazon.in/");
		

	}

}
