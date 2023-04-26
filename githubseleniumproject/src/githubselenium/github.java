package githubselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("welcome mercury tours");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ANZIYA\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();


			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			driver.get("https://demo.guru99.com/test/newtours/");
			driver.findElement(By.name("userName")).sendKeys("MERCURY");
			driver.findElement(By.name("password")).sendKeys("MERCURY");
			driver.findElement(By.name("submit")).click();
			
			//register
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
			
driver.findElement(By.name("firstName")).sendKeys("ansi");
driver.findElement(By.name("lastName")).sendKeys("anzar");
driver.findElement(By.name("phone")).sendKeys("1234");
driver.findElement(By.name("userName")).sendKeys("ANSI");
driver.findElement(By.name("address1")).sendKeys("ABCD");
driver.findElement(By.name("city")).sendKeys("KLM");
driver.findElement(By.name("state")).sendKeys("KERALA");
driver.findElement(By.name("postalCode")).sendKeys("691571");
driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
		}
}


	}


