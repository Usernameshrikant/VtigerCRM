package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_40 
{
	
	   
		@Test
		public void vtiger40() throws InterruptedException
		{
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://localhost:8888");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Organizations")).click();
		    driver.findElement(By.xpath("(//td[@onmouseover=\"this.style.cursor='pointer';\"])[1]")).click();
		    driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.linkText("Sign Out")).click();
			driver.quit();	
		}
		}
		
