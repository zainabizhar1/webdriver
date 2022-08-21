package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class loginfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.ChromeDriver", "chromdriver.exe") ;
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
	
		
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS)	 ;
	WebElement LoginLink =driver.findElement(By.linkText("Log in"));
	LoginLink.click();
	
	//Enter username
	
	WebElement Username = driver.findElement(By.name("user_login"));
	Username.sendKeys("abc@gmail.com");
	
	WebElement Password =driver.findElement(By.id("password"));
	Password.sendKeys("Pasword1");
	
	
	WebElement Checkbox=driver.findElement(By.className("rememberMe"));
	Checkbox.click();
	
	WebElement Loginbutton = driver.findElement(By.name("btn_login"));
	Loginbutton.click();
	
	WebElement Error = driver.findElement(By.id("msg_box"));
	String ActError = Error.getText();
	String ExpError = "The email or password you have entered is invalid.";
	
	if(ActError.equals(ExpError))
	{
	
	System.out.println("TC Passed");
	}
	else 
	{
		System.out.println("TC Failed");
	}
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("total number of links are " + links.size());
	
	for(int index=0;index<links.size();index++)
		System.out.println(links.get(index).getAttribute("href"));
		
	
	driver.close();		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	}


