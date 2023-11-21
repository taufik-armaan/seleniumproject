package seleniumprojecttestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNGtTst {

	    public static void main(String arg[]) {
	    	
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//driver.manage().timeouts().implicitlyWait()
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Testing");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	}


