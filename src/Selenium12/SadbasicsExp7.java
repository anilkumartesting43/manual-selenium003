package Selenium12;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp7 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("jyoti please enter valid URL");
		//we are sending data
		String act_url=sc.nextLine();
		System.out.println("what is your expected output");
		String exp_out=sc.nextLine();
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//create obj
		WebDriver driver = new ChromeDriver();
		//loade the web site
		driver.get(act_url);
		//maximize window
		driver.manage().window().maximize();
		String act_re=driver.getTitle();
		System.out.println("the title:"+act_re);
		if(act_re.equalsIgnoreCase(exp_out))
		{
			System.out.println("the test is pass");
		}
		else
		{
			System.out.println("the test is faild");
			Thread.sleep(2000);
		}
		//close the active window
		//driver.close();
	}


}
