package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Mainhub {
	WebDriver driver;
	public  PO_Mainhub(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='useremail']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//*[@id='password']")
	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//*[@id='LoginForm']/button")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[8]/a")
	WebElement coupon;
	

	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	WebElement add_coupon;
	
	@FindBy(how=How.XPATH,using="//*[@id='coupon_name']")
	WebElement enter_coupon;
	
	@FindBy(how=How.XPATH,using="//*[@id='addcategory']/div/div[2]/div/div/button")
	WebElement add;
	
	public void email(String Email)
	{
		email.sendKeys(Email);
	}
	public void pass(String password)
	{
		pass.sendKeys(password);
	}
	public void login()
	{
		signin.click();
	}
	public void Coupon()
	{
		coupon.click();
	}
	public void Add_coupon()
	{
		add_coupon.click();
	}
	public void enterCoupon(String ecoupon)
	{
		enter_coupon.sendKeys(ecoupon);
	}
	public void Add()
	{
		add.click();
	}
	public void valid(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Invalid(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Blank(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void More(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Less(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Double(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Special(String Email,String password,String ecoupon)
	{
		try {
			email(Email);
			pass(password);
			login();
			Coupon();
			Add_coupon();
			enterCoupon(ecoupon);
			Add();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	


}
