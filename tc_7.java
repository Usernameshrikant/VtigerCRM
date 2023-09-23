package organization;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_7 
{
	
		@Test
		public  void vtiger7() throws InterruptedException 
		{
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://localhost:8888");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Organizations")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("testyentra50");
			Thread.sleep(2000);
			String parent = driver.getWindowHandle();
//			System.out.println(parent);
			driver.findElement(By.cssSelector("img[title='Select']")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while(it.hasNext())
		{
			 String chid = it.next();
//			 System.out.println(chid);
			if(!(parent.equals(chid)))
			{
				driver.switchTo().window(chid);	
		    }
		}
			  driver.findElement(By.linkText("testyentra")).click();
			  driver.switchTo().alert().accept();
			  driver.switchTo().window(parent);
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("input[title='Clear']")).click();
			  Thread.sleep(2000);
			  
			  driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
			  driver.findElement(By.linkText("Sign Out")).click();
			  driver.quit();
			
		}
	}
	
	

