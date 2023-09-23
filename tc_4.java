package organization;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_4 {
	
	
           @Test
	public  void vtiger4()  throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("testyentra 111");
		Thread.sleep(2000);
       WebElement ele = driver.findElement(By.name("accounttype"));
       Select s = new Select(ele);
	     s.selectByValue("Competitor");
	     driver.findElement(By.name("button")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
    	driver.findElement(By.linkText("Sign Out")).click();
	      Thread.sleep(2000);
	      driver.quit();
	}
	}

