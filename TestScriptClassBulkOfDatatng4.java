package org.tng;

import org.basee.BaseClassJava;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestScriptClassBulkOfDatatng4 extends BaseClassJava {

	@Test(dataProvider="logindatas")
	private void tc01(String user,String pass) {
	System.out.println(user);
	System.out.println(pass);
	}
	
	@DataProvider (name ="logindatas")
	public Object[][] getDatas(){
		
		
		return new  Object[][] {
			 {excelRead(1,0),excelRead(2,0)}
			{"shdhd","hdhbbh"},
			{"shdhd","hdhbbh"},
			{"shdhd","hdhbbh"},
			{"shdhd","hdhbbh"}
				};
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

