package ua.falcon;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMegaEnter {

	private static ChromeDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\Software\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().window().maximize();                            
		driver.get("https://mega.nz/login");
	}

	

	@Test
	public void test() {
		
		WebElement email = driver.findElement(By.id("login-name2"));
    	email.sendKeys("sigizmundok@i.ua"); 
    	
    	WebElement password = driver.findElement(By.id("login-password2"));
    	password.sendKeys("**********"); 
    	
    	WebElement checkbox = driver.findElement(By.id("login-check2"));
    	checkbox.click();
    	
    	WebElement enter = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[8]"));
        enter.click();
        
      
}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

}
