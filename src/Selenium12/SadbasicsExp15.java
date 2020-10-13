
package Selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadbasicsExp15 {
	 WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.get("https://www.salesforce.com/form/signup/freetrial-elf-v2/?d=cta-li-promo-147");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	}
	public void fillform() throws InterruptedException
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("jyoti");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("kandel");
		Thread.sleep(1000);
		driver.findElement(By.name("UserEmail")).sendKeys("jyoti.kandel@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("UserTitle")).sendKeys("Software test engineer");
		Thread.sleep(1000);
		driver.findElement(By.name("UserPhone")).sendKeys("9383847473");
		//select dropdowns
		WebElement we1=driver.findElement(By.name("CompanyEmployees"));

		//create select obj
		Select sclobj = new Select(we1);
		//select option by using visible text
		sclobj.selectByValue("10");
		Thread.sleep(2000);
		sclobj.selectByVisibleText("201 - 10,000 employees");
		Thread.sleep(2000);
		sclobj.selectByIndex(4);
		Thread.sleep(2000);
	}
	public void CountryNmae() throws InterruptedException
	
	{
		WebElement we2=driver.findElement(By.name("CompanyCountry"));
		//create obj for select method
		Select sclobj1 =new Select(we2);
		sclobj1.selectByVisibleText("Iceland");
		Thread.sleep(2000);
		sclobj1.selectByValue("DO");
		Thread.sleep(1000);
		sclobj1.selectByIndex(9);
	}
	public void click() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']")).click();
		Thread.sleep(2000);
	}
	public void closeAUT()
	{
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp15 obj =new SadbasicsExp15();
		obj.LaunchAUT();
		obj.fillform();
		obj.CountryNmae();
		obj.click();
		//obj.closeAUT();
	}

}
