package Recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	
	public static String HOSTNAME = "http://localhost:8080";
	//public static String HOSTNAME = "http://192.168.108.60:8080";
	public static void main(String[] args) throws InterruptedException 
	{
		
		

		org.apache.log4j.PropertyConfigurator.configure("D:\\recruitment\\Selenium\\Log4j.properties");
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//test all the positive Scenarios
		
			         TestLoginPage.testLogin(wd);
			
		            // TestAtr.testATRCreation(wd);
			
			      //   TestReport.testReportCreation(wd);
			
                       // TestCreateUser.testUserCreation(wd);
	            
                       TestCreateClient.testClientCreation(wd);
		           
		           //  TestMasterData.testMasterData(wd);
		             
			 /*  String test=   TestForgotPassword.testForgotPassword(wd);
			    
			        if(test=="success") {
			    	     TestLoginPage.testLogin(wd);
			    	     TestAtr.testNegativeATRCreation(wd);
			    	     
			        }
			         if(test=="success") {
			    	     TestLoginPage.testLogin(wd);
			    	     TestAtr.testNegativeATRCreation1(wd);
			    	     
			        }
			    	     if(test=="success") {
				    	     TestLoginPage.testLogin(wd);
				    	     TestCreateUser.testNegativeUserCreation1(wd);
				    }
			    	     if(test=="success") {
				    	     TestLoginPage.testLogin(wd);
				    	     TestCreateClient.testNegativeClientCreation(wd);
				     }*/
			    	     
                   // TestDeleteData.testLogin(wd);
	
	}
	
	
	public static void quitApp(WebDriver wd) {
		
	
		
		try {
			Thread.sleep(10000);
			wd.quit();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

}
