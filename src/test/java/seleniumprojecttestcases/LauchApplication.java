package seleniumprojecttestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LauchApplication {

	
	@Test
    public void setup() throws InterruptedException {
    	
  
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.co.in/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Testing");
	String title = driver.getTitle();
	System.out.println(title);
	
	Thread.sleep(2000);
	//driver.close();
	
}
}