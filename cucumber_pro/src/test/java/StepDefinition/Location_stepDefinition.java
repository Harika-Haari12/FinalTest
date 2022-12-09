package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Location_stepDefinition {
	WebDriver driver;
    public Login_page lp;
    
   
	
	@Given("Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		try {
		    WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\HC69847\\eclipse-workspace\\Cucumber\\Xlogist-project\\target\\chromedriver.exe");
	        driver=new ChromeDriver();	
	        Thread.sleep(2000);

	        driver.manage().window().maximize();
	        lp = new Login_page(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get(url);
	}

	@When("User enters Emails as {string} and password as {string} and click on Login")
	public void user_enters_emails_as_and_password_as(String mail, String pass) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		  try {
		        lp.valid(mail,pass);
		        lp.Clicklogin();
		       }catch(Exception ex)
		       {
		           ex.printStackTrace();
		       }
	}

	
@Then("page title should be {string}")
public void page_title_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	lp.locations();

}

@Then("click in the locations with the name {string}")
public void click_in_the_locations_with_the_name(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	lp.country();
	
}
@When("user click on the button {string} and enter as {string}")
public void user_click_on_the_button_and_enter_as(String add, String name) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	lp.add_c();
	lp.enter(name);
}




@Then("click on the button {string}")
public void click_on_the_button(String add) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	lp.add();
}

@When("User wants to click on {string}")
public void user_wants_to_click_on(String main) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	try {
		lp.Main();
		
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
@Then("finaly click on {string}")
public void finaly_click_on(String log) {
    
		lp.Logout();
		
	
}


	@Then("close browser.")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



}



