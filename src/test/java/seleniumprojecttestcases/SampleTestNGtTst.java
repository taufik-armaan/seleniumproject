package seleniumprojecttestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNGtTst {

	    public static void main(String arg[]) throws InterruptedException {
	    	
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://www.google.co.in/");
		  
		  //driver.manage().timeouts().implicitlyWait()
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Testing");
		  String title = driver.getTitle(); System.out.println(title);
		  
		  Thread.sleep(2000);
		 
		  
		
			/*
			 * driver.get(
			 * "https://www.amazon.in/s?k=books&crid=2JAXCGF52HNC1&sprefix=books%2Caps%2C279&ref=nb_sb_noss_1"
			 * ); Thread.sleep(3000); driver.findElement(By.
			 * linkText("World's Greatest Pack for Personal Growth and Wealth (Set of 4 Books)"
			 * )).click();
			 */
				
		driver.close();
		
	}
	
	}


