package ua.falcon;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMegaRegistration {
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
    	 WebElement enterLink = driver.findElement(By.className("top-buttons"));
 		enterLink.click();
    	 
    	WebElement name = driver.findElement(By.id("register-firstname-registerpage2"));
    	name.sendKeys("Sigizmund");
    	
    	WebElement fname = driver.findElement(By.id("register-lastname-registerpage2"));
    	fname.sendKeys("Dunplunpinkovskii"); 
    	
    	WebElement email = driver.findElement(By.id("register-email-registerpage2"));
    	email.sendKeys("sigizmundok@i.ua"); 
		
    	WebElement password = driver.findElement(By.id("register-password-registerpage2"));
    	password.sendKeys("**********"); 
    	
    	WebElement password2 = driver.findElement(By.id("register-password-registerpage3"));
    	password2.sendKeys("**********"); 
    	
    	WebElement checkbox = driver.findElement(By.id("register-check-registerpage2"));
    	checkbox.click();
    	
    	WebElement registration = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[7]\r\n" + ""));
    	 registration.click();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

}
