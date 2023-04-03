package StepDefinition;

import org.testng.Assert;

import PageObject.LoginSnoc;
import Utils.Setuptest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSnocStepdefinition {

	public Setuptest testsetup;

	public LoginSnocStepdefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
	}

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	}

	@When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.enterusername(strArg1);
		s1.enterpassword(strArg2);
		Thread.sleep(2000);
		s1.clickOnLoginButton();
		System.out.println("loged in successfully");
	}

	@Then("^Verify the login is successful$")
	public void verify_the_login_is_successful() throws Throwable {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
	}
	
	@Given("Click dot symbol")
	public void click_dot_symbol() throws InterruptedException {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.ClickThreeDot();
	}

	@When("click on order option")
	public void click_on_order_option() {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.Clickorder();
	}

	@When("click on lpo")
	public void click_on_lpo() {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		s1.ClicklpoOption();
	}

	@Then("click on create LPOs")
	public void click_on_create_lp_os() throws InterruptedException {
		LoginSnoc s1 = testsetup.pageObjectManager.getLoginPage();
		Thread.sleep(3000);
		s1.Clickcreatelpos();

		// Login page validation
		String ExpectedName = "Product Name";
		Thread.sleep(3000);
		String actualName = s1.ExpectedLoginvalidation();
		System.out.println("UI component validation : " + actualName);
		Assert.assertEquals(actualName, ExpectedName, "login validation not matched");
	}
}
