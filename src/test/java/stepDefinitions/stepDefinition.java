package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinition {
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	 
		System.out.println("Hello");
	 
	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);
	
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^cards displayed \"([^\"]*)\"$")
	public void cards_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	}
}
