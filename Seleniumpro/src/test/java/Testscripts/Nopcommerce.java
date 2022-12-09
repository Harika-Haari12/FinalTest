package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nopcommerce {
	public static void main(String[] args)
	{
		try {
			
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HC69847\\eclipse-workspace2\\Seleniumpro\\target\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.nopcommerce.com/en");
				driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MINUTES);
				driver.manage().window().maximize();
				
				WebElement usericon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3])"));
				WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
				Actions action=new Actions(driver);
				action.moveToElement(usericon);
				Thread.sleep(2000);
				action.click(registerlink).build().perform();
				
				
				
				driver.quit();
			 
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
