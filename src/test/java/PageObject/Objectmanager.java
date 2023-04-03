package PageObject;

import org.openqa.selenium.WebDriver;

public class Objectmanager {
	
public WebDriver driver;
	
	public LoginSnoc loginPage;
	public CreatingLpo Lpo;
	
	public Objectmanager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginSnoc getLoginPage() {
		loginPage = new LoginSnoc(driver);
		return loginPage;
	}
	
	public CreatingLpo getLpo() {
		Lpo = new CreatingLpo(driver);
		return Lpo;
	}

}
