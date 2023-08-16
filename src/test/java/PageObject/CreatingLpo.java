package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatingLpo {
	
	public WebDriver driver;

	public CreatingLpo(WebDriver driver) {
		this.driver = driver;	
	}
	// without selecting products we con't move 
	    By clicknext = By.xpath("//*[@id=\"wizardSave\"]");
	    By popup = By.xpath("/html/body/div[9]/div/div/div[1]/div");
	    By clickOKrequest = By.xpath("/html/body/div[9]/div/div/div[2]/button");
	    
	    public void clicknext1() {
	    	driver.findElement(clicknext).click();
	    	}
	    	
	    	public String Expectedpopupvalidation() throws InterruptedException {
	    		Thread.sleep(3000);
	    		String actualName=driver.findElement(popup).getText();
	    		return actualName;
	    	}	
	    		
	    	public void acceptrequest() {
	    		driver.findElement(clickOKrequest).click(); 
	    	} 
	    	
	    // with selecting product validate	    	
	    	By clickcheckbox = By.xpath("//*[@id=\"cb_list_order_edit_grid\"]");
	        By gotonextpage = By.xpath("//*[@id=\"wizardSave\"]");
	        By Productname = By.xpath("/html/body/div[3]/div/div[15]/div/div/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[3]/div[3]/div/table/tbody/tr[4]/td[6]");
	        
	        public void clickcheckbox() {
	    		driver.findElement(clickcheckbox).click();
	    	}
	        
	        public void gotonextpage() { 
	    		driver.findElement(gotonextpage).click();
	    	}
	    	
	    	public String productnamevalidation() throws InterruptedException {
	    		Thread.sleep(3000);
	    		String actualName=driver.findElement(Productname).getText();
	    		return actualName;
	    	}
	    	
 // seller filtration	    	
	    	By clicksellerfilter1= By.xpath("//*[@id=\"sub_orders_grid_div_row\"]");
			By selectseller = By.xpath("//*[@id=\"org_ids\"]/option[9]");
			By clickgo = By.xpath("//*[@id=\"filterOrderedProductsListGrid\"]");
			By clickcheckbox1 = By.xpath("//*[@id=\"cb_list_order_edit_grid\"]");
			By clicknext1 = By.xpath("//*[@id=\"wizardSave\"]");
			By clicknext2 = By.xpath("//*[@id=\"wizardSave\"]");
			By clickview = By.xpath("//*[@id=\"seller_lpo_accordion_53993\"]/div/div[1]/h4");
			By clickfinish = By.xpath("//*[@id=\"wizardSave\"]");
			By clickOk = By.xpath("/html/body/div[9]/div/div/div[2]/button[2]");
			By reqsuccessfull = By.xpath("/html/body/div[9]/div/div/div[2]/button");
			
			
			public void sellerfiltaration() {
				driver.findElement(clicksellerfilter1).click();
			}
			
			public void selectseller() {
				driver.findElement(selectseller).click();
			}
			
			public void clickGo() {
				driver.findElement(clickgo).click();
			}
			
			public void clickcheckbox1() {
				driver.findElement(clickcheckbox1).click();
			}
			public void clicknext() {
				driver.findElement(clicknext1).click();
			}
			public void clicknext2() {
				driver.findElement(clicknext2).click();
			}
			public void clickview() {
				driver.findElement(clickview).click();
			}
			public void clickfinish() {
				driver.findElement(clickfinish).click();
			}
			public void clickOk() {
				driver.findElement(clickOk).click();
			}
			public void reqsuccessfull() {
				driver.findElement(reqsuccessfull).click();
			}
			
	// select all product and validate the all products are selected
			By selectall = By.xpath("//input[@name='form-field-checkbox']");
			By validateselectall = By.xpath("//span[@id='selectedOrdItmsCount']");
			
			public void clickselectallcheckbox() {
				driver.findElement(selectall).click();
			}			
				public String validateallprodselected() throws InterruptedException {
		    		Thread.sleep(3000);
		    		String actualName=driver.findElement(validateselectall).getText();
		    		return actualName;				
			}
				
	// partially generated lpo 
				By searchid= By.xpath("//input[@id='gs_ord_id']");
				By selectproduct = By.id("jqg_list_order_edit_grid_1");
				By next1 = By.xpath("//button[@id='wizardSave']");
				By next2 = By.xpath("//button[@id='wizardSave']");
				By clickview1 = By.xpath("//*[@id=\"seller_lpo_accordion_54652\"]/div/div[1]/h4/a");
				By clickfinish1 = By.xpath("//button[@id='wizardSave']");
				By clickOKrequest1 = By.xpath("/html/body/div[8]/div/div/div[2]/button[2]");
				By OKrequest = By.xpath("/html/body/div[8]/div/div/div[2]/button");
				By clickcreatelpos = By.xpath("//*[@id=\"formButtons\"]/div/kout[3]");
				By searchid2= By.xpath("//input[@id='gs_ord_id']");
				By broccoli = By.xpath("//td[text()='Broccoli']");
				
				public void searchtheid() throws InterruptedException {
			          driver.findElement(searchid).sendKeys("63336");		
					Actions act = new Actions(driver);
					Thread.sleep(4000);
					act.sendKeys(Keys.ENTER).perform();				
				}		
				public void selectproduct() {
					driver.findElement(selectproduct).click();			
				}				
				public void gotonext1() {
					driver.findElement(next1).click();					
				}
				public void gotonext2() {
					driver.findElement(next2).click();
				}
				
				public void clickonview() {
					driver.findElement(clickview1).click();
				}
				
				public void clickonfinish() {
					driver.findElement(clickfinish1).click();
				}
				public void clickOkrequest() {
					driver.findElement(clickOKrequest1).click();
				}
				public void OKrequest() {
					driver.findElement(OKrequest).click();
				}
				
				public void ClickONcreatelpos() {
					driver.findElement(clickcreatelpos).click();
				}
				
				public void searchtheid2() throws InterruptedException {
			          driver.findElement(searchid2).sendKeys("62774");		
					Actions act = new Actions(driver);
					Thread.sleep(3000);
					act.sendKeys(Keys.ENTER).perform();
				}		
				
				public String ExpectedNameBroccoli() throws InterruptedException {
					Thread.sleep(3000);
					String actualName=driver.findElement(broccoli).getText();
					return actualName;
			}
				
	//without edite coustomer order quantity
				By searchid1= By.xpath("//input[@id='gs_ord_id']");
				By selectproduct1 = By.id("jqg_list_order_edit_grid_1");
				By next11 = By.xpath("//button[@id='wizardSave']");
				By clicknext12 = By.xpath("//button[@id='wizardSave']");
				By clickview12 = By.xpath("//*[@id=\"seller_lpo_accordion_54122\"]/div/div[1]/h4");
				By clickfinish12 = By.xpath("//button[text()='Finish']");
				By clickok = By.xpath("//button[text()='OK']");
				By clickrequestok = By.xpath("/html/body/div[8]/div/div/div[2]/button");
				By validateLpocreated = By.xpath("/html/body/div[9]/div/div/div[1]/div");
				
				public void searchtheid1() throws InterruptedException {
			          driver.findElement(searchid).sendKeys("63336");		
					Actions act = new Actions(driver);
					Thread.sleep(4000);
					act.sendKeys(Keys.ENTER).perform();					
				}
				
				public void selectproduct1() {
					driver.findElement(selectproduct1).click();
				}
				
				public void clicknext11() {
					driver.findElement(next11).click();
				}
				
				public void clicknext12() {
					driver.findElement(clicknext12).click();
				}
				
				public void clickview12() {
					driver.findElement(clickview12).click();
				}
				
				public void clickfinish12() {
					driver.findElement(clickfinish12).click();
				}
				
				public void clickOkbutton() {
					driver.findElement(clickok).click();
				}
				
				public void clickrequestosuccessfull() {
					driver.findElement(clickrequestok).click();
				}	
				public String validateLpocreatedSuccessfully() throws InterruptedException {
		    		Thread.sleep(3000);
		    		String actualName=driver.findElement(validateLpocreated).getText();
		    		return actualName;
				}
				
	// with edit the customer order quantity and validate the next page
				By searchid3= By.xpath("//input[@id='gs_ord_id']");
				By selectproduct2 = By.id("jqg_list_order_edit_grid_1");
				By next3 = By.xpath("//button[@id='wizardSave']");
				By clearnumber = By.xpath("//input[@type='number']");
				By clickrequest = By.xpath("/html/body/div[9]/div/div/div[2]/button");
				By enterquantity = By.xpath("//input[@type='number']");
				By quantityvalidation = By.xpath("/html/body/div[3]/div/div[15]/div/div/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div[1]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[6]");
				By clicknext4 = By.xpath("//button[@id='wizardSave']");
				By clickview2 = By.xpath("//*[@id=\"seller_lpo_accordion_54591\"]/div/div[1]/h4");
				
				public void searchtheid3() throws InterruptedException {
			          driver.findElement(searchid).sendKeys("63333");		
					Actions act = new Actions(driver);
					Thread.sleep(4000);
					act.sendKeys(Keys.ENTER).perform();
				}
				public void selectproduct2() {
					driver.findElement( selectproduct2).click();
				}
				public void clicknext3() {
					driver.findElement(next3).click();
				}
				
				public void clearvalue() {
					driver.findElement(clearnumber).clear();
		}
		
				public void acceptok() {
					driver.findElement(clickrequest).click();
		}
		
		public void Enterquantity() {
			driver.findElement(enterquantity).sendKeys("100");
		}		
			public void gotonextpage1() {
				driver.findElement(clicknext4).click();
			}
			public void viewthedetails() {
				driver.findElement(clickview2).click();
			}
				public String ExpectedNameQuantity() throws InterruptedException {
					Thread.sleep(3000);
					String actualName=driver.findElement(quantityvalidation).getText();
					return actualName;
}
	// change the seller name and validate the changed seller name
				By searchID = By.xpath("//input[@id='gs_ord_id']");
				By selectProd = By.xpath("//*[@id=\"jqg_list_order_edit_grid_1\"]");
				By clickmore = By.xpath("//*[@id=\"1\"]/td[29]/div/button");
				By clickedit = By.xpath("//*[@id=\"1\"]/td[29]/div/ul/li/a");
				By changeseller = By.xpath("//*[@id=\"1_mapping_org_desc\"]");	
				By selectseller1 = By.xpath("//*[@id=\"1_mapping_org_desc\"]/option[4]");
				By clickmore2 = By.xpath("//*[@id=\"1\"]/td[29]/div/button");
				By saveEdit = By.xpath("//*[@id=\"1\"]/td[29]/div/ul");
				By okrequest = By.xpath("//button[text()='OK']");
				By clicknext3 = By.xpath("//button[@id='wizardSave']");
				By sellername = By.xpath("//*[@id=\"1_mapping_org_desc\"]/option[4]");
				
				public void searchtheID() throws InterruptedException {
			          driver.findElement(searchid).sendKeys("63345");		
					Actions act = new Actions(driver);
					Thread.sleep(4000);
					act.sendKeys(Keys.ENTER).perform();
				}
				public void selectproduct5() {
					driver.findElement(selectProd).click();
				}
				public void clickmoreOption() {
					driver.findElement(clickmore).click();
				}
				
				public void clickonEditOption() {
					driver.findElement(clickedit).click();
				}
				
				public void clickchangSellername() {
					driver.findElement(changeseller).click();
				}
				
				public void selectseller1() {
					driver.findElement(selectseller1).click();
				}
				
				public void clickmore2() {
					driver.findElement(clickmore2).click();
				}
				
				public void savechanges() {
					driver.findElement(saveEdit).click();	
				}
				
				public void clicOkrequest() {
					driver.findElement(okrequest).click();
				}
				
				public void clicknext4() {
							driver.findElement(clicknext3).click();
						}
				
				public String ExpectedSellername() throws InterruptedException {
					Thread.sleep(3000);
					String actualName=driver.findElement(sellername).getText();
					return actualName;
				}
				
		// same sellers many products we can consolidate the all orders
				By nextpage2 = By.xpath("//*[@id=\"next_jqGridPager\"]/span"); 
			    By product1 = By.xpath("//input[@id='jqg_list_order_edit_grid_1']");
			    By product2 = By.xpath("//input[@id='jqg_list_order_edit_grid_2']");
			    By product3 = By.xpath("//input[@id='jqg_list_order_edit_grid_3']");
			    By gotonext2 = By.xpath("//*[@id=\"wizardSave\"]");
			    By sellername1 = By.xpath("/html/body/div[3]/div/div[15]/div/div/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[8]");
			    
			    public void goto2ndpage2() {
					driver.findElement(nextpage2).click();		
				}
				public void product1() { 
					driver.findElement(product1).click();
				}
				public void product2() { 
					driver.findElement(product2).click();
				}
				public void product3() { 
					driver.findElement(product3).click();
				}
				public void gotonextpage2() { 
					driver.findElement(gotonext2).click();
				}
				
				public String sellernamevalidation() throws InterruptedException {
					Thread.sleep(3000);
					String actualName=driver.findElement(sellername1).getText();
					return actualName;
			}
		
		// selected date wise we can generate Lpo
				By selectFromdate = By.xpath("");
}
