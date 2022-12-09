package Testcase;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Mainhub;
import Utility.BrowserManager;

public class Mainhub_Testcase {
	WebDriver driver;
	JSONObject mainhub;
	
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="data/Main.json";
			datais=getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener=new JSONTokener(datais);
			mainhub=new JSONObject(tokener);
			System.out.println("data is :"+mainhub.toString());
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@BeforeMethod
	@Parameters({"browser","url"})//user
	public void setup(String browser,String url) throws InterruptedException
	{
		driver=BrowserManager.getDriver(browser);
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
		//extentTest = extentReport.startTest("registration_TestCase");
	}
	@Test(priority=1)
	public void Valid_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("Valid").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj.valid(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=2)
	public void Invalid_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("Invalid").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj.Invalid(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=3)
	public void Blank()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("Blank").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj. Blank(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=4)
	public void more_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("more_char").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj. More(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=5)
	public void less_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("less").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj. Less(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=6)
	public void double_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("Double_space").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj.Double(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@Test(priority=7)
	public void special_data()
	{
		try {
			String Email=mainhub.getJSONObject("Valid").getString("email");
			String password=mainhub.getJSONObject("Valid").getString("password");
			String ecoupon=mainhub.getJSONObject("Special_char").getString("enter_coupon");
			PO_Mainhub obj=PageFactory.initElements(driver, PO_Mainhub.class);
			obj.Special(Email, password, ecoupon);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	
	

}
