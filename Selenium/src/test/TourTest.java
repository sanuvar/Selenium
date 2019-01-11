package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TourTest {

public class NewTourTest{	
	
@Test
public void TourTest()
{
	System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http;//newtours.demoaut.com/");
	
	driver.findElement(By.id("userName")).sendKeys("Tom");
	driver.findElement(By.id("password")).sendKeys("password1234");
	
	driver.findElement(By.linkText("Sign-on")).clear();
	
	driver.close();

	driver.quit();
	
	
	



	
	
	
	
	
	
}	
	
}	
}
