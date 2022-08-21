package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver= new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 
 WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
 signup.click();

 WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
 WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
 fname.sendKeys("zainab");
 lname.sendKeys("Izhar");
 
 WebElement Day =driver.findElement(By.name("birthday_day"));
 Select dday =new Select(Day);
 dday.selectByVisibleText("20");
 
 WebElement month =driver.findElement(By.name("birthday_month"));
 Select dmonth =new Select(month);
 dmonth.selectByVisibleText("Jan");
 
 WebElement year =driver.findElement(By.name("birthday_year"));
 Select dyear = new  Select(year);
 dyear.selectByVisibleText("1992");
  
 List<WebElement> months = dmonth.getOptions();
 for(WebElement elm: months) {
	 System.out.println(elm.getText());
 }
 
 
 
 
 
 
	}

}
