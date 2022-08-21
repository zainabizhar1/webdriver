package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
  
  WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
  WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
  WebElement loginbutton  = driver.findElement(By.xpath("//button[@name='login']"));
  
  username.sendKeys("abc@xyz.com");
  password.sendKeys("Password1");
  loginbutton.click();
  
  
  driver.close();
  
  
  
  
  
  
  
	}

}
