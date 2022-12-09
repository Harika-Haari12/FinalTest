package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.login_city;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
/*
public class city_StepDefinition {
	WebDriver driver;
	public  login_city lc;
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		try {
		    WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\HC69847\\eclipse-workspace\\Cucumber\\Xlogist-project\\target\\chromedriver.exe");
	        driver=new ChromeDriver();	
	        Thread.sleep(2000);

	        driver.manage().window().maximize();
	        lc = new login_city(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	@When("you open url with {string}")
	public void you_open_url_with(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get(url);
	}

	@When("enter email as {string} and password as {string} click on login")
	public void enter_email_as_and_password_as_click_on_login(String email, String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		try {
			lc.valid(email, pass);
			lc.clicklogin();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	@Then("the title contains as {string}")
	public void the_title_contains_as(String location) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		lc.locat();
	}
	@Then("click on {string}")
	public void click_on(String city)
	{
		lc.city();
	}

	@When("you click on {string}")
	public void you_click_on(String add) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lc.Add_C();
		
	}

	@Then("you can enter city as {string}")
	public void you_can_enter_city_as(String enter_C) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lc.E_city(enter_C);
	}
	@Then("user click on {string}")
	public void user_click_on(String add_c)
	{
		lc.add();
	}
	



}*/
