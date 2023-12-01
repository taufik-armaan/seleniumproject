package seleniumprojecttestcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN1289G0&p=google");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/']")).click();
		
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		Set<String> win = driver.getWindowHandles();
		
		
		for (String elem: win) {
			System.err.println(elem);
		}
				Set<String> window1 = driver.getWindowHandles();
				Iterator<String> it = window1.iterator();
				String parentWindow = it.next();
				String childWindow = it.next();
				
				driver.switchTo().window(childWindow);
				driver.findElement(By.id("APjFqb")).sendKeys("Testing");
				
	}

}
