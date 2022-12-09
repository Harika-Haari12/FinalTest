package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HC69847\\eclipse-workspace\\Cucumber\\Xlogist-project\\target\\chromedriver.exe");
	   public WebDriver driver;
	    
	    public Login_page(WebDriver driver)
	    {
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath="//input[@id='useremail']")
	    @CacheLookup
	    WebElement emailinput;
	    public void email1(String mail)
	    {    
	        emailinput.sendKeys(mail);
	    }
	    
	    @FindBy(xpath="//input[@id='password']")
	    @CacheLookup
	    WebElement password;
	    public void password1(String pass)
	    {
	        password.sendKeys(pass);
	    }
	    
	    @FindBy(xpath="//button[@type='submit']")
	    @CacheLookup
	    WebElement submit;
	    public void submit1()
	    {
	        submit.click();
	    }
	    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/a")
	    @CacheLookup
	    WebElement locations;
	    public void locat()
	    {
	    	locations.click();
	    }
	    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
	    @CacheLookup
	    WebElement country;
	    public void Country()
	    {
	    	country.click();
	    }
	    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	    @CacheLookup
	    WebElement add_C;
	    public void Add_C()
	    {
	    	add_C.click();
	    }
	    @FindBy(xpath="//*[@id='Country']")
	    @CacheLookup
	    WebElement enter_C;
	    public void E_country(String country)
	    {
	    	enter_C.sendKeys(country);
	    }
	    @FindBy(xpath="//*[@id='addCountry']/div/div[2]/div/div/button")
	    @CacheLookup
	    WebElement add;
	    public void Add()
	    {
	    	add.click();
	    }
	 
	    
	    @FindBy(xpath="/html/body/div[2]/div[2]/ul/li/span")
	    @CacheLookup
	    WebElement main;
	    public void Main()
	    {
	    	main.click();
	    }
	    
	    @FindBy(xpath="(//div[@class='drop-down dropdown-profile']/div/ul/li)[3]")
	    @CacheLookup
	    WebElement logout;
	    public void Logout()
	    {
	    	logout.click();
	    }
	    
	    
	    public void valid(String mail,String pass)
	    {
	        email1(mail);
	        password1(pass);
	    }
	    
	    public void Clicklogin()
	    {
	        submit1();
	    }
	    public void locations()
	    {
	    	locat();
	    }
	    public void country()
	    {
	    	Country();
	    }
	    public void add_c()
	    {
	    	Add_C();
	    }
	    public void enter(String name)
	    {
	    	E_country(name) ;
	    }
	    public void add()
	    {
	    	Add();
	    }
	   
	   
	    public void mainhub()
	    {
	    	Main();
	    }
	    public void Log()
	    {
	    	Logout();
	    }
	    

}
