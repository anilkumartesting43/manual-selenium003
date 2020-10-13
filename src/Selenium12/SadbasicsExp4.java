package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp4 {

	public static void main(String[] args) throws InterruptedException {
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//driver obj
		WebDriver driver= new ChromeDriver();
		//launch website
		driver.get("http://tourism.gov.in/");
		//maximuise the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//close the active window using selenium
		driver.close();

	}

}
