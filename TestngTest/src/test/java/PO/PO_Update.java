package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Update {
	WebDriver driver;
	public  PO_Update(WebDriver driver)
	{
		this.driver=driver;	
	}
	@FindBy(how=How.XPATH,using="//*[@id='useremail']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//*[@id='password']")
	WebElement pass;
	
	@FindBy(how=How.XPATH,using="//*[@id='LoginForm']/button")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[3]/a/i")
	WebElement product;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement  category;
	
	@FindBy(how=How.XPATH,using="//*[@id='bootstrap-data-table-export']/tbody/tr[1]/td[6]/a[1]")
	WebElement edit_cat;
	
	@FindBy(how=How.XPATH,using="//*[@id='category_name']")
	WebElement cat_name;
	
	@FindBy(how=How.XPATH,using="//*[@id='editCategory']/div[2]/div/button")
	WebElement update_button;
	
	@FindBy(how=How.XPATH,using="//*[@id='bootstrap-data-table-export']/tbody/tr[1]/td[6]/a[2]")
	WebElement edit_cat_image;
	
	@FindBy(how=How.XPATH,using="//input[@id='inputFile-2']")
	WebElement Browse;
	
	@FindBy(how=How.XPATH,using="//*[@id='addSubcategory']/div/div[2]/div/div/button")
	WebElement update;
	
	public void email(String Email)
	{
		email.sendKeys(Email);
	}
	public void pass(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void login()
	{
		signin.click();
	}
	public void Product()
	{
		product.click();
	}
	public void Category()
	{
		category.click();
	}
	public void EditCat()
	{
		edit_cat.click();
	}
	public void Enter_Cat(String catname)
	{
		cat_name.clear();
		cat_name.sendKeys(catname);
	}
	public void Update()
	{
		update_button.click();
	}
	public void Edit_image()
	{
		edit_cat_image.click();
	}
	public void browse(String image)
	{
		Browse.sendKeys(image);
	}
	public void update_B()
	{
		update.click();
	}
	
	public void valid(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Invalid(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void blank(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void more(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Less(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Double(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void Numbers(String Email,String pwd,String catname,String image)
	{
		try {
			email(Email);
			pass(pwd);
			login();
			Product();
			Category();
			EditCat();
			Enter_Cat(catname);
			Update();
			Edit_image();
			browse(image);
			update_B();
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
