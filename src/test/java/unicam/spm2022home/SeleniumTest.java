package unicam.spm2022home;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.EnabledOnOs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTest {
	
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() {
		String projectPath = System.getProperty("user.id");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	 @BeforeEach
	 void setUp() throws Exception {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	
	@Test
	public void checkProsSite() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //istanciated the driver
		driver.get("http://localhost:8080/maven-archetype-webapp/");
		
		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2022";
		
		Thread.sleep(4000);
		
		Assert.assertEquals(et, at);
		driver.close();
		driver.quit();
	}

}
