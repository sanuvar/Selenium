package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {



	
@Test //junit annotation it marks the method as a terst method
public void Login () { 

//declare what browser would you use and where is the browser driver located
System.setProperty("webdriver.chrome.driver","C:\\auto\\chromedriver.exe");
//open the chrome browser and it is also means driver is geting reffered as a chrome browser
//makes the connection with the driver & chrome.

// 1st step
//driver means selenium and driver is getting referred as chrome browser
WebDriver driver = new ChromeDriver();

//2nd step
//get means to go specific URL
driver.get("http://demosite.center/wordpress/wp-login.php");

//3rd step
//for identifying element we use driver.findelement
//for typing in the element we use sendkeys

driver.findElement(By.id("user_login")).sendKeys("admin");

//4th steps
driver.findElement(By.id("user_pass")).sendKeys("demo123");
 
//5th steps
driver.findElement(By.id("wp-submit")).click();

//6th steps verify if homepage is displayes
//Displayed means is a certain element displaying properly or not 
driver.findElement(By.id("titlt")).isDisplayed();

//2nd verification
driver.findElement(By.id("save-post")).isDisplayed();

//validation make sure its passing
System.out.println("Login works");

//closing browser
driver.close();

//end the test case
driver.quit();






		




	
}
}
