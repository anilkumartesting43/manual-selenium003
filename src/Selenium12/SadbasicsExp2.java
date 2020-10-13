package Selenium12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp2 {

	public static void main(String[] args) {
		//we need driver path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//driver object
		WebDriver driver =new FirefoxDriver();
	}

}
