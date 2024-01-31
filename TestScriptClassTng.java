package org.tng;

import java.io.IOException;

import org.basee.BaseClassJava;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomoct2023.LoginPageClass;

public class TestScriptClassTng extends BaseClassJava {

	
	public static LoginPageClass pomoct2023;
                         
	@Parameters({"browser"})
	@Test(priority=1)
	public  static  void Browserlogin( String Browsertype) throws IOException {                                              
                 	
		getDriver(Browsertype);                                              
		
		
			}

	@Test(priority=2)
	public   void Browserlaunched() {
	getUrl("https://adactinhotelapp.com/");
	}
	
	@Test(priority=3,dataProvider="logindatas",dataProviderClass=TestScriptClassBulkOfDatatng4.class)
	public void Entevalidcredentials (String user,String pass) {
		pomoct2023 =new LoginPageClass();
		WebElement username = pomoct2023.getUsername();
		username.sendKeys(user);
		WebElement password = pomoct2023.getPassword();
		password.sendKeys(pass);
	}
	@Test(priority=4)
	public  void Loginbuttonclick() throws InterruptedException, IOException {
		pomoct2023 =new LoginPageClass();
		WebElement login = pomoct2023.getLogin();
		login.click();
	}
	
	@Test(priority=5)
    public static void LoginMessageClick() {
	System.out.println("login successful");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}















