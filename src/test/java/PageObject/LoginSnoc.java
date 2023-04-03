package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSnoc {
	
	public WebDriver driver;

	public LoginSnoc(WebDriver driver) {
		this.driver = driver;	
	}
	
	By phNum = By.xpath("//*[@id=\"username\"]");
	By passWord = By.xpath("//*[@id=\"password\"]");
	By login = By.xpath("/html/body/div/div/section/div/div[2]/div[1]/form/div[3]/div/input[4]");
	
	By clickdot= By.xpath("//*[@id=\"menu-toggle-button\"]/i");
	By clickorder = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a");
	By clicklpo= By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/ul/li[12]/a/span");
	By clickcreatelpos = By.xpath("//*[@id=\"formButtons\"]/div/kout[3]");
    By Loginvalidation = By.xpath("//*[@id=\"jqgh_list_order_edit_grid_prd_nm\"]");
    
    public void enterusername(String s1) {
		driver.findElement(phNum).sendKeys(s1);
	}

	public void enterpassword(String s2) {
		driver.findElement(passWord).sendKeys(s2);		
	}
	
	public void clickOnLoginButton() {
		driver.findElement(login).click();
	}
	
	public void ClickThreeDot() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(clickdot).click();
	}
	
	public void Clickorder() {
		driver.findElement(clickorder).click();
	}
	
	public void ClicklpoOption() {
		driver.findElement(clicklpo).click();
	}
	
	public void Clickcreatelpos() {
		driver.findElement(clickcreatelpos).click();
	}
	
	public String ExpectedLoginvalidation() throws InterruptedException {
		Thread.sleep(3000);
		String actualName=driver.findElement(Loginvalidation).getText();
		return actualName;
	} 

	

}
