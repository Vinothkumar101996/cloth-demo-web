package demo.com;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class new_demo_maven {
	@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\eclipse_java\\eclipse\\chromedriver-win64\\chromedriver-win64\\chrome.driver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vinoth/git/cloth-demo-web/index.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
	
		
		
		
		
	}

}



