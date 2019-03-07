package Recruitment;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestReport {
	
	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/report.html";
	public static void testReportCreation(WebDriver wd) throws InterruptedException
	
	{
		
		testPositiveReportCreation(wd);
		
		
		}
	//test case no :3---
    public static void testPositiveReportCreation(WebDriver wd) throws InterruptedException
    
 {
     wd.get(UserURL);
	 wd.manage().window().maximize(); 
	  
     Select dropdown = new Select(wd.findElement(By.id("report")));
	 
	     dropdown.selectByIndex(1);
	     logger.info("select by Index 1");
	     Thread.sleep(1000);
	 
	 Select dropdown1 = new Select(wd.findElement(By.id("statuscategory")));
	     dropdown1.selectByIndex(2);
	     logger.info("select by Index 2");
	     Thread.sleep(1000);
	
	 Select dropdown2 = new Select(wd.findElement(By.id("statustype")));
	     dropdown2.selectByIndex(1);
	     logger.info("select by Index 1");
	    // Thread.sleep(1000);
	 
	    /* wd.findElement(By.xpath("//button[@class='dt-button buttons-copy buttons-html5']")).click();
	     logger.info("selected item: Copied ");
	     Thread.sleep(2000);
	     wd.findElement(By.xpath("//button[@class='dt-button buttons-csv buttons-html5']")).click();
	     logger.info("selected item: Download csv format ");
	     Thread.sleep(2000);
	     wd.findElement(By.xpath("//button[@class='dt-button buttons-excel buttons-html5']")).click();
	     logger.info("selected item :Download excel format ");
	     Thread.sleep(2000);
	     wd.findElement(By.xpath("//button[@class='dt-button buttons-pdf buttons-html5']")).click();
	     logger.info("selected item : Download Pdf format  ");
	     Thread.sleep(2000);
	  wd.findElement(By.xpath("//button[@class='dt-button buttons-print']")).click();
	     logger.info("selected item in click to Print:Print Page Open ");*/
	   
	   //  wd.quit();
	  

		 //report page generate sucessfully
		
 
 
      }
 
 
}
