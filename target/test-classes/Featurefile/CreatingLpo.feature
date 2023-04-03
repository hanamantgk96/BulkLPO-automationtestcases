
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background:
    Given Launch the browser
    When Login with username "SNOCADMIN" and password "Snoc@1234"
    Then Verify the login is successful
    Given Click dot symbol
    When click on order option
    When click on lpo 
    Then click on create LPOs

  @Login_02
  Scenario: without selecti any product we can validte the popup
  Given click next page 
  When validate the popup successfully
  
  @Login_03
  Scenario: with selecting product we can validate all products consolidate
  Given click the checkbox
  When select all the products
  Then validate selected products are going to consolidation page
  
  @Login_04
  Scenario: filter the seller and create lpo for perticular seller
    Given navigate the lpo page
    When filter the sellers
    Then sellect the sellers in the dropdown
    Then sellect the product
    And create the lpo successfully
    
    @Login_05
    Scenario: click select all option and validate all products are selected
    Given click select all option
    When validate the all products are selected

		@Login_06
		Scenario: without Edit customer order quantity we can generate lpo
		Given select the products
    When go to next page
    Then click finish
    And create lpo successfully and status is waiting for acceptance
		
		 @Login_07
    Scenario: parcially generate for Lpo
    Given I want to search the customer id
    When I want generate lpo for few products
    Then I validate the generated lpo weigther it is present or not
    And check more outcomes
    
    @Login_08
    Scenario: Edit the customer order quantity and generate the lpo
    Given select the product
    When edite the quantity
    Then validate Edit quantity
    And finish edit changes
    
    @Login_09
    Scenario: edite the seller name and validte changed seller name
    Given navigate the page
    When click on more option
    Then click on Edit button
    Then chang the seller name
    And save the changes
    And validate the changed seller name



