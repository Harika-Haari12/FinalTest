package Testcase;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Update;
import Utility.BrowserManager;

public class Update_Testcase {
	
	WebDriver driver;
	JSONObject update;
	
	@BeforeClass
	public void beforeClass() throws Exception
	{
		InputStream datais=null;
		try
		{
			String FileName="data/update.json";
			datais=getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener=new JSONTokener(datais);
			update=new JSONObject(tokener);
			System.out.println("data is :"+update.toString());
			
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
		
	}
	@Test(priority=1)
	public void valid()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("Valid").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.valid(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=2)
	public void Invalid()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("Invalid").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.Invalid(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=3)
	public void Blank()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("Blank").getString("enter_cat");
			String image=update.getJSONObject("Blank").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.blank(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=4)
	public void More()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("more").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.more(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=5)
	public void less()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("less").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.Less(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=6)
	public void Double()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("Double_S").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.Double(Email, pwd, catname, image);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=7)
	public void numbers()
	{
		try {
			String Email=update.getJSONObject("Valid").getString("email");
			String pwd=update.getJSONObject("Valid").getString("pass");
			String catname=update.getJSONObject("numbers").getString("enter_cat");
			String image=update.getJSONObject("Valid").getString("image");
			PO_Update obj=PageFactory.initElements(driver,PO_Update.class);
			obj.Numbers(Email, pwd, catname, image);
			
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
