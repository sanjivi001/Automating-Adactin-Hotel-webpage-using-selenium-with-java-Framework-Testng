package org.tng;

import org.basee.BaseClassJava;
import org.basee.WebDriver;

import pomoct2023.LoginPageClass;

public class TestScriptClassBulkOfDataExecutionTng4 extends BaseClassJava {

	public static LoginPageClass pomoct2023;
	public static WebDriver driver;
	
	getDriver("Edge");
	
	getUrl("https://adactinhotelapp.com/");
	

	@Test(priority=3,dataProvider="logindatas",dataProviderClass=TestScriptClassBulkOfDatatng4.class)
	public void Entevalidcredentials (String user,String pass) {
		pomoct2023 =new LoginPageClass();
		WebElement username = pomoct2023.getUsername();
		username.sendKeys(user);
		WebElement password = pomoct2023.getPassword();
		password.sendKeys(pass);
	}
	
	
	
	
	
}
