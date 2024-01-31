package org.basee;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pomoct2023.LoginPageClass;


public class Calling extends BaseClassJava {
public static void main(String[] args) throws IOException {
	BaseClassJava B=new BaseClassJava();
	B.getDriver("Edge");
	B.getUrl("www.facebook.com");
	LoginPageClass page=new LoginPageClass ();
	WebElement username = page.getUsername();
	username.sendKeys(B.excelRead(1, 0));
	driver.navigate().refresh();
	username.sendKeys(B.excelRead(1, 0));
	WebElement paassword = page.getPassword();
	paassword.sendKeys(B.excelRead(1, 0));
	driver.navigate().refresh();
	paassword.sendKeys(B.excelRead(1, 0));
}
}
