package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  WebElement FileUpload = driver.findElement(By.name("uploadfile_0"));
  
	FileUpload.sendKeys("C:\\Users\\dell\\Desktop\\uploadfile.txt");
	
	WebElement TnC = driver.findElement(By.id("terms"));
	TnC.click();
	
	WebElement Submit = driver.findElement(By.id("submitbutton"));
	Submit.click();
		
	}

}
