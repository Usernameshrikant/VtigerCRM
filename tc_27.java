package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_27 {
	
	
		@Test
		public void vtiger27() throws InterruptedException
		{
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://localhost:8888");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Organizations")).click();
			driver.findElement(By.name("search_text")).sendKeys("shan");
			WebElement ele = driver.findElement(By.id("bas_searchfield"));
			 Select s = new Select(ele);
		      s.selectByValue("accountname");	
			driver.findElement(By.name("submit")).click();
			 Thread.sleep(3000);
		      driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();
		        driver.quit();	
		}
	}

