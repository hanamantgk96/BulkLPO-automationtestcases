package StepDefinition;

import org.testng.Assert;

import PageObject.CreatingLpo;
import Utils.Setuptest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLpoStepdefinition {
	
	public Setuptest testsetup;

	public CreateLpoStepdefinition(Setuptest testSetup) {
		this.testsetup = testSetup;
	}
	
	@Given("click next page")
	public void click_next_page() {
		CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
		lpo.clicknext1();
    }

    @When("^validate the popup successfully$")
    public void validate_the_popup_successfully() throws Throwable {
    	
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	String ExpectedName1="Please select minimum one product to create an LPO...";
		 Thread.sleep(3000);
		 String actualName1 = lpo.Expectedpopupvalidation();
		 System.out.println("popup validation : " + actualName1);
		 Assert.assertEquals(actualName1, ExpectedName1, "Title is not matched");
		 
		 lpo.acceptrequest();   
		 }
    
    // with sellectin products
    
    @Given("^click the checkbox$")
    public void click_the_checkbox() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.clickcheckbox();
    }

    @When("^select all the products$")
    public void select_all_the_products() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(3000);
    	lpo.gotonextpage();
    }

    @Then("^validate selected products are going to consolidation page$")
    public void validate_selected_products_are_going_to_consolidation_page() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	
    	String ExpectedName2="Pepper Green";
		 Thread.sleep(3000);
		 String actualName2 = lpo.productnamevalidation();
		 System.out.println("product name validation : " + actualName2);
		 Assert.assertEquals(actualName2, ExpectedName2, "Title is not matched");
    	}
    
  //seller filtration 
    
    @Given("^navigate the lpo page$")
    public void navigate_the_lpo_page() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();		
    }

    @When("^filter the sellers$")
    public void filter_the_sellers() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	Thread.sleep(3000);
    	lpo.sellerfiltaration();
    }

    @Then("^sellect the sellers in the dropdown$")
    public void sellect_the_sellers_in_the_dropdown() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	
    	Thread.sleep(4000);
    	lpo.selectseller();
    	Thread.sleep(3000);
    	lpo.clickGo();    	
    }

    @Then("^sellect the product$")
    public void sellect_the_product() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo(); 
    	Thread.sleep(3000);
    	lpo.clickcheckbox1();
    	Thread.sleep(2000);
    	lpo.clicknext1();
    	Thread.sleep(2000);
    	lpo.clicknext2();
    }

    @And("^create the lpo successfully$")
    public void create_the_lpo_successfully() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.clickview();
    	Thread.sleep(2000);
    	lpo.clickfinish();
    	Thread.sleep(2000);
//    	lpo.clickOk();
//    	Thread.sleep(2000);
//    	lpo.reqsuccessfull();
    }
    
   //select all option validating
    
    @Given("^click select all option$")
    public void click_select_all_option() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	lpo.clickselectallcheckbox();
    }

    @When("^validate the all products are selected$")
    public void validate_the_all_products_are_selected() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	
    	String ExpectedName2="63";
		 Thread.sleep(3000);
		 String actualName2 = lpo.validateallprodselected();
		 System.out.println("selected products are : " + actualName2);
		 Assert.assertEquals(actualName2, ExpectedName2, "Number is not matched");
    }
    
   // without Editing customer order quantity generate lpo
    
   
    
   // partially generated lpo
    
    @Given("^I want to search the customer id$")
    public void i_want_to_search_the_customer_id() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(5000);
    	lpo.searchtheid();
    	Thread.sleep(3000);
    	lpo.selectproduct();
    	
    } 

    @When("^I want generate lpo for few products$")
    public void i_want_generate_lpo_for_few_products() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	Thread.sleep(2000);
    	lpo.gotonext1();
    	Thread.sleep(2000);
    	lpo.gotonext2();
    	Thread.sleep(2000);
    	lpo.clickonview();
    	Thread.sleep(2000);
    	lpo.clickonfinish();
    	Thread.sleep(2000);
    	lpo.clickOkrequest();    	
    }

    @Then("^I validate the generated lpo weigther it is present or not$")
    public void i_validate_the_generated_lpo_weigther_it_is_present_or_not() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	Thread.sleep(3000);
    	lpo.OKrequest();
    	Thread.sleep(5000);
    	lpo.ClickONcreatelpos();
    	Thread.sleep(4000);
    	lpo.searchtheid2();
    	
    	String ExpectedName="Broccoli";
		 Thread.sleep(3000);
		 String actualName = lpo.ExpectedNameBroccoli();
		 System.out.println("Products name validation : " + actualName);
		 Assert.assertEquals(actualName, ExpectedName, "product Name is not matched");
    }

    @And("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
      
    }
    
// without edit customer order qty
    
    @Given("^select the products$")
    public void select_the_products() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	Thread.sleep(3000);
    	Thread.sleep(3000);
    	lpo.searchtheid1();
		Thread.sleep(3000);
		lpo.selectproduct1();
    }

    @When("^go to next page$")
    public void go_to_next_page() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();        
    	Thread.sleep(3000);
    	lpo.clicknext11();
    	Thread.sleep(2000);
    	lpo.clicknext12();
    }

    @Then("^click finish$")
    public void click_finish() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	    
    	Thread.sleep(2000);
    	lpo.clickview12();
    	Thread.sleep(2000);
    	lpo.clickfinish12();
    }

    @And("^create lpo successfully and status is waiting for acceptance$")
    public void create_lpo_successfully_and_status_is_waiting_for_acceptance() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();    	
    	Thread.sleep(2000);
    	lpo.clickOkbutton();
    	Thread.sleep(2000);
    	String ExpectedName="Request Processed Successfully..!";
		 Thread.sleep(3000);
		 String actualName = lpo.validateLpocreatedSuccessfully();
		 System.out.println("validation for create Lpo successfully : " + actualName);
		 Assert.assertEquals(actualName, ExpectedName, " the Name is not matched");
//    	lpo.clickrequestosuccessfull();
    }
    
  // edit the customer order quantity and generate the lpo   
    @Given("^select the product$")
    public void select_the_product() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.searchtheid3();
    	Thread.sleep(2000);
    	lpo.selectproduct2();
    	Thread.sleep(2000);
    	lpo.clicknext3();
    }

    @When("^edite the quantity$")
    public void edite_the_quantity() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(3000);
    	lpo.clearvalue();
    	Thread.sleep(2000);
    	 lpo.acceptok();
    }
    @Then("^validate Edit quantity$")
    public void validate_edit_quantity() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.Enterquantity();
    	Thread.sleep(2000);
    	lpo.gotonextpage1();
    	Thread.sleep(3000);
    	lpo.viewthedetails();
    	
    	String ExpectedName="100";
		 Thread.sleep(3000);
		 String actualName = lpo.ExpectedNameQuantity();
		 System.out.println("quantity validation : " + actualName);
		 Assert.assertEquals(actualName, ExpectedName, "quantity is not matched");
    }

    @And("^finish edit changes$")
    public void finish_edit_changes() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	
    }
    
    // Change the seller name and validate
    
    @Given("^navigate the page$")
    public void navigate_the_page() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.searchtheID();
    }

    @When("^click on more option$")
    public void click_on_more_option() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	lpo.selectproduct5();
    	Thread.sleep(3000);
    	lpo.clickmoreOption();
    }

    @Then("^click on Edit button$")
    public void click_on_edit_button() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.clickonEditOption();
    }

    @Then("^chang the seller name$")
    public void chang_the_seller_name() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.clickchangSellername();
    	Thread.sleep(2000);
    	lpo.selectseller1();
    }

    @And("^save the changes$")
    public void save_the_changes() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(2000);
    	lpo.clickmore2();
    	Thread.sleep(2000);
    	lpo.savechanges();
    	lpo.clicOkrequest();
    	Thread.sleep(2000);
    	lpo.clicknext4();
    }

    @And("^validate the changed seller name$")
    public void validate_the_changed_seller_name() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	
    	String ExpectedName="The Deep seafood Co LLC";
		 Thread.sleep(3000);
		 String actualName = lpo.ExpectedSellername();
		 System.out.println("seller name validation : " + actualName);
		 Assert.assertEquals(actualName, ExpectedName, "seller Name is not matched");
   }
    
    // same seller with many products
    
    @Given("^navigate the page1$")
    public void navigate_the_page1() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    }

    @When("^select products for same seller$")
    public void select_products_for_same_seller() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	Thread.sleep(3000);
    	lpo.goto2ndpage2();
    	Thread.sleep(3000);
    	lpo.product1();
    	lpo.product2();
    	lpo.product3();
    	Thread.sleep(3000);
    	lpo.gotonextpage2();
    }

    @Then("^on cosolidation page we need to validate all the products with same seller$")
    public void on_cosolidation_page_we_need_to_validate_all_the_products_with_same_seller() throws Throwable {
    	CreatingLpo lpo = testsetup.pageObjectManager.getLpo();
    	
    	String ExpectedName3="Al Ajban Chicken";
   	 Thread.sleep(5000);
   	 String actualName3 = lpo.sellernamevalidation();
   	 System.out.println("seller name validation : " + actualName3);
   	 Assert.assertEquals(actualName3, ExpectedName3, "Title is not matched"); 
   	}    
    
}
