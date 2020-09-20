package stepDefs;

import org.apache.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.pojo;
import reusableMethods.SetDataForWebsite;

public class StepDefinitions {
	 SetDataForWebsite sd = new SetDataForWebsite();
	    pojo obj = new pojo();
	    Logger log = Logger.getLogger(StepDefinitions.class);


	    @Given("Page for navigation is {string} for {string}")
	    public void pageForNavigationIsFor(String url, String browser) {

	        sd.getDriver(browser, log);

	        sd.getUrl(url);


	    }

	    @When("clicked on registration")
	    public void clicked_on_registration() {
	        // Write code here that turns the phrase above into concrete actions
	        sd.clickOnRegistration(log);
	    }

	    //"<FIRSTNAME>" "<LAST NAME>" "<EMAIL>" "<PASSWORD>" "<CONFIRM PASSWORD>" "<BIRTHDATE-month>" "<BIRTHDATE-year>" "<ZIP CODE>"
	    @Then("Enter the details for registration like {string} {string} {string} {string} {string} {string} {string} {string}")
	    public void enter_the_details_for_registration_like(String firstname, String lastname, String email, String password, String confirmpassword, String birthmonth, String birthyear, String zipcode) {
	        // Write code here that turns the phrase above into concrete actions
	        sd.registrationDetails(firstname, lastname, email, password, confirmpassword, birthmonth, birthyear, zipcode, log);

	    }

	    @Given("Page for navigation")
	    public void page_for_navigation() {
	        // Write code here that turns the phrase above into concrete actions
	        sd.getDriver(obj.getBrowser(), log);
	        sd.getUrl(obj.getUrl());


	    }

	    @When("clicked on login")
	    public void clicked_on_login() {
	        // Write code here that turns the phrase above into concrete actions
	        sd.clickOnlogin(log);
	    }

	    @Then("Enter the details for login like  {string} {string}")
	    public void enter_the_details_for_login_like(String email, String password) {
	        // Write code here that turns the phrase above into concrete actions
	        sd.loginWithDetails(email, password, log);
	    }

	    @When("clicked on Forgot password")
	    public void clicked_on_Forgot_password() {
	        // Write code here that turns the phrase above into concrete actions
	        sd.forgotPassword(log);
	    }

	    @When("Enter the details for password reset like  {string}")
	    public void enter_the_details_for_password_reset_like(String email) {
	        // Write code here that turns the phrase above into concrete actions
	        sd.resetPassword(email, log);
	    }

	    @Then("clicked on password reset")
	    public void clicked_on_password_reset() {
	        // Write code here that turns the phrase above into concrete actions
	        sd.reset(log);
	    }

}
