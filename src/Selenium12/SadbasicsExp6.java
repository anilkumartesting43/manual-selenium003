package Selenium12;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp6 {

	public static void main(String[] args) throws InterruptedException {
		//scanner obj
     Scanner sc=new Scanner(System.in);
     System.out.println("hi jyoti what is your working time");
     //nextInt method
     int work_time =sc.nextInt();
     //using for loop
     for(int i=0;i<=work_time;i++)
     {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
    	//create obj for driver
    	WebDriver driver =new ChromeDriver();
    	//load the website
    	driver.get("https://www.instagram.com/");
    	//wait for some time
    	Thread.sleep(3000);
    	//maximize window
    	driver.manage().window().maximize();
     }
     System.out.println("working is over");
     
		

	}

}
