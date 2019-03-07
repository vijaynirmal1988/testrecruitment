package Recruitment;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestMasterData {
	
	
	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/client.html";
	public static void testMasterData(WebDriver wd) throws InterruptedException

	
	{
		testPositiveMasterData(wd);
		//testNegativeMasterData(wd);
		
	}
	//test case 6---
	public static void testPositiveMasterData(WebDriver wd) throws InterruptedException
	{
		wd.manage().window().maximize();
		wd.get(UserURL);
		wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebElement formElement = wd.findElement(By.id("addMasterform"));
        List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}
		Select dropdown = new Select(wd.findElement(By.id("masterType")));
		dropdown.selectByIndex(1);
		formElement.findElement(By.name("name")).sendKeys("html");
		formElement.findElement(By.name("description")).sendKeys("html");
		formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
	    Alert alert = wd.switchTo().alert();
 		alert.getText();
 		alert.accept();
 		Thread.sleep(5000);//Master sucessfully created;
	}
	public static void testPositiveEditMasterData(WebDriver wd) throws InterruptedException
	{
		wd.get(UserURL);
		wd.findElement(By.id("editMasterBtn0")).click();
		WebElement formElement = wd.findElement(By.id("updateMasterform"));
        List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));
		
		for (WebElement we : allFormChildElements)
		{
		    System.out.println(we.getAttribute("class"));
		   
		}
		
		
		formElement.findElement(By.id("editClientName")).clear();
		logger.info("Clear the Exciting text");
		formElement.findElement(By.id("editClientName")).sendKeys("Mumbai");
	    logger.info("editClientName:Mumbai");
	    formElement.findElement(By.id("editClientKey")).clear();
	    logger.info("Clear the Exciting text");
	    formElement.findElement(By.id("editClientKey")).sendKeys("MUB");
	    logger.info("editClientKey:MUB");
	    formElement.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
 		Alert alert = wd.switchTo().alert();
 		System.out.println(alert.getText());
 		alert.accept();
 		Thread.sleep(5000);//Master sucessfully updated;
 		logger.info("Click:Master Page Updated "); 
 		wd.navigate().back();
	
		
	}
}
