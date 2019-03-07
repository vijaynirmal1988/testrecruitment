package Recruitment;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCreateClient {
	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/client.html";
	
	public static void testClientCreation(WebDriver wd) throws InterruptedException
	{   
		testPositiveClientCreation(wd);
		testPositiveEditClient(wd);
		//testPositiveDeleteClient(wd);
		//testPositiveInactiveClient(wd);
     	//testNegativeClientCreation(wd);
		}
	 //test case :5----
	public static void testPositiveClientCreation(WebDriver wd) throws InterruptedException
	{
		wd.manage().window().maximize();
		wd.get(UserURL);
	    wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		logger.info("Create User Page Button clicked");
		WebElement formElement = wd.findElement(By.id("addClientform"));
		List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		}	 
		formElement.findElement(By.name("clientName")).sendKeys("Tata Consultancy ");
	    logger.info("Entered client name:Tata Consultancy ");
		formElement.findElement(By.name("clientKey")).sendKeys("TC");
		logger.info("Entered client key:TC");
		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
	    logger.info("ClientPage Test case No :5 clientpage created sucessfully");
	 
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
     
 		alert.accept();
 		Thread.sleep(5000);//clientpage created sucessfully
	}
	    public static void testPositiveEditClient(WebDriver wd) throws InterruptedException
 		{
 		wd.manage().window().maximize();
 		wd.get(UserURL);
	    wd.findElement(By.xpath("//*[@id='clientRowId0']/td[3]/button[1]")).click();//view client form
        logger.info("click: View Client Page");
        WebElement formElement = wd.findElement(By.id("updateClientform"));
		List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		}	 
		formElement.findElement(By.id("editClientName")).clear();
        logger.info("Clear the Exciting text");
        Thread.sleep(5000);
        formElement.findElement(By.id("editClientName")).sendKeys("Tata Teleservices");
  		logger.info("editClientName:Tata Telecom");
  		Thread.sleep(5000);
  		formElement.findElement(By.id("editClientKey")).clear();
        logger.info("Clear the Exciting text");
        Thread.sleep(5000);
        formElement.findElement(By.id("editClientKey")).sendKeys("TT");
  		logger.info("editClientKey:TT");
  		Thread.sleep(5000);
  		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
        alert.accept();// client form updated sucessfully
 		logger.info("Click:Client page Updated Success");
 		Thread.sleep(5000);
	}
 		public static void testPositiveDeleteClient(WebDriver wd) throws InterruptedException
 		{
 		wd.manage().window().maximize();
 		wd.get(UserURL);
	    wd.findElement(By.id("deleteClientBtn8")).click();
	    logger.info("Click:Client Remove Success");
	    Thread.sleep(5000);
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
        Thread.sleep(5000);
 		alert.accept();
	    Thread.sleep(5000);
 		Alert alert1 = wd.switchTo().alert();
 		String alertMessage1= wd.switchTo().alert().getText();
 		System.out.println(alertMessage1);	

 		alert1.accept();// client form Remove sucessfully
 		}
 		public static void testPositiveInactiveClient(WebDriver wd) throws InterruptedException
 		{
 		wd.manage().window().maximize();
 		wd.get(UserURL);
	    wd.findElement(By.id("inactiveClient")).click();
	    logger.info("Click:InactiveClient");
	    wd.findElement(By.xpath("//*[@id='clientRowId1']/td[3]/button")).click();
	    logger.info("Click:Click to ReactiveClient");
	    Thread.sleep(5000);
 		Alert alert = wd.switchTo().alert();
 		String alertMessage= wd.switchTo().alert().getText();
 		System.out.println(alertMessage);	
 		alert.accept();
	    Thread.sleep(5000);
 		Alert alert1 = wd.switchTo().alert();
 		String alertMessage1= wd.switchTo().alert().getText();
 		System.out.println(alertMessage1);	
 		alert1.accept();// client form Reactivate sucessfully
}

	    public static void testNegativeClientCreation(WebDriver wd) throws InterruptedException
	{
		
		wd.manage().window().maximize();
		wd.get(UserURL);
	    wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		logger.info("Create User Page Button clicked");
		WebElement formElement = wd.findElement(By.id("addClientform"));
		List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}	 
		formElement.findElement(By.name("clientName")).sendKeys("");
	    logger.info("Entered client name:blank space");
		formElement.findElement(By.name("clientKey")).sendKeys("");
		logger.info("Entered client key:blank space");
		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
	    logger.info("click: Entered client name & Client Key");
		System.exit(0);
	}
		public static String testNegativeEditClient(WebDriver wd) throws InterruptedException
		{
		String redirect ="";
	    wd.findElement(By.xpath("//*[@id='clientRowId0']/td[3]/button[1]")).click();
        logger.info("click: View Client Page");
        WebElement formElement1 = wd.findElement(By.id("updateClientform"));
		List<WebElement> allFormChildElements1 = formElement1.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements1)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}	 
		formElement1.findElement(By.id("editClientName")).clear();
        logger.info("Clear the Exciting text");
        formElement1.findElement(By.id("editClientName")).sendKeys("");
  		logger.info("editClientName:");
  		formElement1.findElement(By.id("editClientKey")).clear();
        logger.info("Clear the Exciting text");
        formElement1.findElement(By.id("editClientKey")).sendKeys("");
  		logger.info("editClientKey:");
  		formElement1.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        logger.info("Click:Client page Updated Success");
	    redirect="Sucess";
		return redirect;
		
        }
		
	
  }
