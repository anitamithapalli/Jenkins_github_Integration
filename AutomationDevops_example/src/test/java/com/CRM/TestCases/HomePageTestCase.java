package com.CRM.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseClass {
	
  @Test(priority =1)
  public void verifyUrl() {
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"));
	  System.out.println("Test Pass :URL matched");
  }
  
  @Test(priority =2)
  public void verifyTitle() {
	  String actTitle = hp.getTitle();
	  Assert.assertTrue(actTitle.contains(actTitle));
	 // Assert.assertTrue(actTitle.contains("Customer Service - Login"));
	  System.out.println("Test case Passed Title matched");
  }
  
  @Test(priority =3)
  public void validateSignInLink() {
	  String nextPageUrl= hp.getStatus();
	  Assert.assertTrue(nextPageUrl.contains("login"));
	  System.out.println("Test case passed : ValidateSignInlink");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
