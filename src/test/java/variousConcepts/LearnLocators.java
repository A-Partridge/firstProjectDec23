package variousConcepts;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
	public void setup() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aliss\\OneDrive\\Desktop\\Selenium\\Selenium-02\\driver\\chromedriver.exe");	
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");	
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		//File Upload
		//as long as the tag is "input" use sendKeys method
		//anything else use "Robot" class
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Aliss\\OneDrive\\Desktop\\Dec23\\This is a Test.docx");
		
		//Link Text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Backend")).click();
		
		//CSS not used very much...  Left off Session 2 2:50
		
	}
	
}



