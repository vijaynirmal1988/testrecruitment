package Recruitment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCreateUser {

	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	
	final static String UserURL = TestMain.HOSTNAME +   "/rec/user.html";

	public static void testUserCreation(WebDriver wd) throws InterruptedException
	{
		
	  testPositiveUserCreation(wd);
     // testPositiveEditUser(wd);
	//  testNegativeUserCreation1(wd);
	
	
		
		
	}
		//test case :4----
    public static void testPositiveUserCreation(WebDriver wd) throws InterruptedException
	{
		wd.manage().window().maximize();
		
		wd.get(UserURL);
	   
		wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		logger.info("Create User Page Button clicked");
		WebElement formElement = wd.findElement(By.id("userRegisterForm"));
		List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}
		formElement.findElement(By.id("firstName")).sendKeys("Vijay ");
		logger.info("Entered firstName:vijay");
	    formElement.findElement(By.id("lastName")).sendKeys("nirmal");
	    logger.info("Entered lastName:nirmal");
	    formElement.findElement(By.id("userName")).sendKeys("vijaynirmal212");
		logger.info(" Entered userName:vijaynirmal");
		formElement.findElement(By.id("email")).sendKeys("vijaynirmal21@gmail.com");
		logger.info("Entered email:vijaynirmal1@gmail.com");
		formElement.findElement(By.id("userPassword")).sendKeys("chennai12");
		logger.info(" Entered userPassword:chennai12");
		formElement.findElement(By.id("userRepassword")).sendKeys("chennai12");
		logger.info("Entered userRepassword:chennai12");
		
		Select dropdown2 = new Select(wd.findElement(By.id("role")));
		dropdown2.selectByIndex(3);
		logger.info("select by Index 3:Recruit Executive");
		 
		Select se2= new Select(wd.findElement(By.id("managerList")));
		se2.selectByIndex(3);
 		logger.info("select by Index 3:magesh");
 		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
        Thread.sleep(5000);
 		alert.accept();
 		logger.info("UserPage Test case No 4:userpage sucessfully created");
 		Thread.sleep(5000);//userpage sucessfully created
 		
	}
    public static void testPositiveEditUser(WebDriver wd) throws InterruptedException
   	{
        wd.get(UserURL);
    	wd.findElement(By.id("editUserBtn0")).click();// view user form
		WebElement formElement = wd.findElement(By.id("updateUserForm"));
        List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}
		formElement.findElement(By.id("editFirstName")).clear();
		logger.info("Clear the Exciting text");
		formElement.findElement(By.id("editFirstName")).sendKeys("arun");
	    logger.info("editClientName:arun");
	    formElement.findElement(By.id("editLastName")).clear();
	    logger.info("Clear the Exciting text");
	    formElement.findElement(By.id("editLastName")).sendKeys("R");
	    logger.info("editClientKey:R");
	    formElement.findElement(By.id("editUserName")).clear();
		logger.info("Clear the Exciting text");
		formElement.findElement(By.id("editUserName")).sendKeys("arun");
	    logger.info("editClientName:arun");
	    formElement.findElement(By.id("editEmail")).clear();
	    logger.info("Clear the Exciting text");
	    formElement.findElement(By.id("editEmail")).sendKeys("arunr@gmail.com");
	    logger.info("editClientKey:arunr@gmail.com");
	    Select se1= new Select( formElement.findElement(By.id("editRoleList")));
        se1.selectByIndex(3);
		logger.info("Role listSelected:RecruitExecutive");
		Select se21= new Select( formElement.findElement(By.id("editManagerList")));
	    se21.selectByIndex(3);
		logger.info("Manager list Seleced:3");
		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
        Thread.sleep(5000);
 		alert.accept();//userpage updated sucessfully
 		logger.info("Click:User Page updated "); 
 		Thread.sleep(5000);
		}
	
	
		public static String testNegativeUserCreation1(WebDriver wd) throws InterruptedException 
		
	{
			String redirect ="";
			wd.manage().window().maximize();
		
		wd.get(UserURL);
	   
		wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		logger.info("Create User Page Button clicked");
		WebElement formElement = wd.findElement(By.id("userRegisterForm"));
		List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}
		formElement.findElement(By.id("firstName")).sendKeys("12345 ");
		logger.info("Entered firstName:12345");
	    formElement.findElement(By.id("lastName")).sendKeys("67890");
	    logger.info("Entered lastName:67890");
	    formElement.findElement(By.id("userName")).sendKeys("8991012");
		logger.info(" Entered userName:8991012");
		formElement.findElement(By.id("email")).sendKeys("vijaynirmal1gmail.com");
		logger.info("Entered email:vijaynirmal1gmail.com");
		formElement.findElement(By.id("userPassword")).sendKeys("chennai1");
		logger.info(" Entered userPassword:chennai1");
		formElement.findElement(By.id("userRepassword")).sendKeys("chennai12");
		logger.info("Entered userRepassword:chennai12");
		
		Select dropdown2 = new Select(wd.findElement(By.id("role")));
		 
	    dropdown2.selectByIndex(3);
		 logger.info("select by Index 3:Recruit Executive");
		 
		Select se2= new Select(wd.findElement(By.id("managerList")));
		se2.selectByIndex(0);
 		 logger.info("select by Index 3:");
 		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
 		logger.info("UserPage Test case No 4:Enter Valid Data"); // Enter Valid Data
 		Thread.sleep(5000);
         redirect="Sucess";
		 return redirect;
		}
         
        
	}

	
		
		

	
	
		
	
	

	
	
	
	
	

