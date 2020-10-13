package Selenium12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp19 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void MultiSelector() throws InterruptedException
	{
		//switch driver obj frame page to iframe
		driver.switchTo().frame("iframeResult");
		//automate multiselector
		WebElement we=driver.findElement(By.name("cars"));
		// create select obj
		Select slcobj =new Select(we);
		if(slcobj.isMultiple())
		{
			System.out.println("this is multiselecctor");
			//select multiful options
			slcobj.selectByVisibleText("Volvo");
			slcobj.selectByValue("audi");
			Thread.sleep(2000);
			List<WebElement>allslcoptions=slcobj.getAllSelectedOptions();
			for(int i=0; i<allslcoptions.size();i++)
			{
				String option=allslcoptions.get(i).getText();
				System.out.println("selected options is:"+option);
			}
		}
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp19 obj =new SadbasicsExp19();
		obj.LaunchAUT();
		obj.MultiSelector();
		obj.closeAUT();

	}

}
