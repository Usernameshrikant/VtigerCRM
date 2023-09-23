package organization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc_3 
{


		@Test	
	public void vtiger3() throws InterruptedException 
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
		driver.findElement(By.name("accountname")).sendKeys("testyentra17");
		Thread.sleep(2000);
		driver.findElement(By.name("accountname")).sendKeys("testyentra12");
		WebElement industry= driver.findElement(By.name("industry"));
	      Select s = new Select(industry);
	     s.selectByValue("Banking");
	     Thread.sleep(2000);
	 	driver.findElement(By.name("button")).click();
	     driver.quit();
	}
}