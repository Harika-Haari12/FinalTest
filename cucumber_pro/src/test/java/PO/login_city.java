package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_city {
public WebDriver driver;
    
    public login_city(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@id='useremail']")
    @CacheLookup
    WebElement email;
    public void email(String Email)
    {
    	email.sendKeys(Email);
    }
    
    @FindBy(xpath="//*[@id='password']")
    @CacheLookup
    WebElement pass;
    public void pass(String Pass)
    {
    	pass.sendKeys(Pass);
    }
    
    @FindBy(xpath="//*[@id='LoginForm']/button")
    @CacheLookup
    WebElement login;
    public void signin()
    {
    	login.click();
    }
    
    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/a")
    @CacheLookup
    WebElement locations;
    public void Location()
    {
    	locations.click();
    }
    
    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[3]/a")
    @CacheLookup
    WebElement city;
    public void City()
    {
    	city.click();
    }
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
    @CacheLookup
    WebElement add_city;
    public void add_city()
    {
    	add_city.click();
    }
    @FindBy(xpath="//*[@id='city']")
    @CacheLookup
    WebElement enter_city;
    public void Enter_city()
    {
    	enter_city.click();
    }
    @FindBy(xpath="//*[@id='addCity']/div/div[2]/div/div/button")
    @CacheLookup
    WebElement add;
    public void Add()
    {
    	add.click();
    }
    
    public void valid(String email,String pass)
    {
    	email(email);
    	pass(pass);
    }
    public void clicklogin()
    {
    	signin();
    }
    public void locat()
    {
    	Location();
    }
    public void city()
    {
    	City();
    }
    public void Add_C()
    {
    	add_city();
    }
    public void E_city(String cityname)
    {
    	E_city(cityname);
    }
    public void add()
    {
    	Add();
    }
    
  

}
