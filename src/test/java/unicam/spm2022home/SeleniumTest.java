package unicam.spm2022home;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SeleniumTest {
	
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
