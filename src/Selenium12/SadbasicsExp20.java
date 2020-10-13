package Selenium12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp20 {
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
			Thread.sleep(2000);
	    	//deselect option
	    	slcobj.deselectByVisibleText("Volvo");
	    	slcobj.deselectAll();
	    }
	    else
	    {
	    System.out.println("this is not multiselector");
	    }
	    //switch to driver obj from frame to page
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	}
    

public void Gettextmsg() throws InterruptedException
{
	String msg=driver.findElement(By.xpath("//*[@id=\'framesize\']")).getText();
	System.out.println("the text msg is:"+msg);
	
	
}
public void closeAUT()
{
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp20 obj = new SadbasicsExp20();
		obj.LaunchAUT();
		obj.MultiSelector();
		obj.Gettextmsg();
		//obj.closeAUT();
	}

}
