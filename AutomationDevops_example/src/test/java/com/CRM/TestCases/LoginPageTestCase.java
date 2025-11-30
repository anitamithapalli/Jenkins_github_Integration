package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class LoginPageTestCase extends BaseClass{
  @BeforeClass
  public void pageSetup()
  {
	  hp.getStatus();
  }
	
	@Test
  public void validateLogin() {
	String url = lp.doLogin("anita.mithapalli@gmail.com", "test123");
	Assert.assertTrue(url.contains("customer"),"failed");
	System.out.println("Test case Passed Login succesfull****************");
	  
  }
	
}
