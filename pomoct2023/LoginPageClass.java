package pomoct2023;

import org.basee.BaseClassJava;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass extends BaseClassJava {

	 public LoginPageClass() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how=How.ID,using="username")
	 public WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(how=How.ID,using="password")
	 public WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(how=How.ID,using="login")
	 public WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
