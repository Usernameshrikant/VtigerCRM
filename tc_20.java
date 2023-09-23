package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_20 {
	
		
		
			@Test
			public void vtiger20() throws InterruptedException
			{
				WebDriver driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://localhost:8888");
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Organizations")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
				driver.findElement(By.name("accountname")).sendKeys("testyentra 110");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[onclick='return copyAddressRight(EditView)']")).click();
				driver.findElement(By.name("bill_street")).sendKeys("karvenagar shahucolony lane no4");
				driver.findElement(By.id("bill_pobox")).sendKeys("two");
				driver.findElement(By.name("bill_city")).sendKeys("pune");
				driver.findElement(By.name("bill_state")).sendKeys("Maharashtra");
				driver.findElement(By.id("bill_code")).sendKeys("431401");
				driver.findElement(By.name("bill_country")).sendKeys("india");
				Thread.sleep(2000);
				 driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
				 Thread.sleep(3000);
			      driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
					driver.findElement(By.linkText("Sign Out")).click();
			        driver.quit();	
			}
	}
	

