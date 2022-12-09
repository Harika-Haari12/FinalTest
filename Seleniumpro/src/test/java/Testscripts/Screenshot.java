package Testscripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		try {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en/register-result/2");
			driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MINUTES);
			driver.manage().window().maximize();
			
			File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
				FileUtils .copyFile(screenshotFile,new File(".//Screenshots/nopcommerce.png"));
				driver.quit();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
