package Recruitment;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestAtr {
	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/atr.html";
	public static void testATRCreation(WebDriver wd) throws InterruptedException
	{
		
		testPositiveATRCreation(wd);
		testNegativeATRCreation(wd);
		testNegativeATRCreation1(wd);
		
		}
	
	//test case no 2 -- 
	public static void testPositiveATRCreation(WebDriver wd) throws InterruptedException
	{
		
		
		wd.manage().window().maximize();
	    wd.get(UserURL);
	    wd.findElement(By.xpath("//*[@id='createAtrBtn']")).click();
        logger.info("Clicked Create ATR Button");
	    wd.findElement(By.name("noOfPosition")).sendKeys("5");
		logger.info("Entered Position:5");
		wd.findElement(By.name("role")).sendKeys("Developer");
		logger.info("Role Entered:Developer");
		Select se1= new Select(wd.findElement(By.id("location")));
        se1.selectByIndex(1);
		logger.info("Location Entered:chennai");
		wd.findElement(By.name("jobDescription")).sendKeys("javadeveloper");
		logger.info("Entered jobDescription:javadeveloper");
		Select dropdown = new Select(wd.findElement(By.id("skills")));
		dropdown.selectByIndex(1);
		logger.info("Entered Skills:Python");
		wd.findElement(By.name("minSalary")).sendKeys("10000");
		logger.info("SalaryEntered:10000");
		wd.findElement(By.name("maxSalary")).sendKeys("10000000");
		logger.info("maxSalaryEntered:10000000");
		wd.findElement(By.name("experience")).sendKeys("5");
		logger.info("EnteredExperience:5");
		WebElement selectDate= wd.findElement(By.id("completionDate"));
		selectDate.clear();
		selectDate.sendKeys("08-05-2014");
		logger.info("Date Entered:08-05-2014");
		
		Select dropdown1 = new Select(wd.findElement(By.id("clientId")));
		 dropdown1.selectByIndex(1);
		 logger.info("Selected Client:Cognizant");
		
		
		
	     Select se11= new Select(wd.findElement(By.id("assignedToList")));
         se11.selectByIndex(1);
 		 logger.info("Selected Assigned:magesh");
 		 wd.findElement(By.id("createAtrBtn")).click();
         logger.info("ATR Page Test case No 2 :ATR Created Sucessfully  "); //ATR Created Sucessfully
          Thread.sleep(2000);
   	  
        
	}
	public static String testNegativeATRCreation(WebDriver wd) throws InterruptedException
	{
		    String redirect ="";
            wd.manage().window().maximize();
		    wd.get(UserURL);
	        wd.findElement(By.xpath("//*[@id=\'createAtrBtn\']")).click();
            logger.info("Clicked Create ATR Button");
            wd.findElement(By.name("noOfPosition")).sendKeys("asdf");
      		logger.info("Entered Position:asdf");
      		wd.findElement(By.name("role")).sendKeys("12345");
      		logger.info("Role Entered:12345");
      		Select se1= new Select(wd.findElement(By.id("location")));
              se1.selectByIndex(0);
      		logger.info("Location Entered:");
      		wd.findElement(By.name("jobDescription")).sendKeys("!@#$$46786");
      		logger.info("Entered jobDescription:!@#$$46786");
      		Select dropdown = new Select(wd.findElement(By.id("skills")));
      		dropdown.selectByIndex(0);
      		logger.info("Entered Skills:");
      		wd.findElement(By.name("minSalary")).sendKeys("asdfg");
      		logger.info("SalaryEntered:asdfg");
      		wd.findElement(By.name("maxSalary")).sendKeys("qwert");
      		logger.info("maxSalaryEntered:qwert");
      		wd.findElement(By.name("experience")).sendKeys("sdfg");
      		logger.info("EnteredExperience:sdfg");
      		WebElement selectDate= wd.findElement(By.id("completionDate"));
      		selectDate.clear();
      		selectDate.sendKeys("zxcvbn");
      		logger.info("Date Entered:zxcvbn");
      		
      		 Select dropdown1 = new Select(wd.findElement(By.id("clientId")));
      		 dropdown1.selectByIndex(0);
      		 logger.info("Selected Client:");
      		
      		
      		
      	     Select se11= new Select(wd.findElement(By.id("assignedToList")));
               se11.selectByIndex(0);
       		 logger.info("Selected Assigned:");
       	     wd.findElement(By.id("createAtrBtn")).click();
             logger.info("ATR Page Test case No 2 :Entered Valid Data");//Atr Page Not Created
             redirect="Sucess";
		     return redirect;
        
	}
	
	public static String testNegativeATRCreation1(WebDriver wd) throws InterruptedException
	{
		    String redirect ="";
            wd.manage().window().maximize();
		    wd.get(UserURL);
	        wd.findElement(By.xpath("//*[@id=\'createAtrBtn\']")).click();
            logger.info("Clicked Create ATR Button");
            wd.findElement(By.name("noOfPosition")).sendKeys("");
      	    logger.info("Entered Position:");
      		wd.findElement(By.name("role")).sendKeys("");
      		logger.info("Role Entered:");
      		Select se1= new Select(wd.findElement(By.id("location")));
              se1.selectByIndex(0);
      		logger.info("Location Entered:");
      		wd.findElement(By.name("jobDescription")).sendKeys("");
      		logger.info("Entered jobDescription:");
      		Select dropdown = new Select(wd.findElement(By.id("skills")));
      		dropdown.selectByIndex(0);
      		logger.info("Entered Skills:");
      		wd.findElement(By.name("minSalary")).sendKeys("");
      		logger.info("SalaryEntered:");
      		wd.findElement(By.name("maxSalary")).sendKeys("");
      		logger.info("maxSalaryEntered:");
      		wd.findElement(By.name("experience")).sendKeys("");
      		logger.info("EnteredExperience:");
      		WebElement selectDate= wd.findElement(By.id("completionDate"));
      		selectDate.clear();
      		selectDate.sendKeys("");
      		logger.info("Date Entered:");
      		
      		 Select dropdown1 = new Select(wd.findElement(By.id("clientId")));
      		 dropdown1.selectByIndex(0);
      		 logger.info("Selected Client:");
      		 Select se11= new Select(wd.findElement(By.id("assignedToList")));
               se11.selectByIndex(0);
       		 logger.info("Selected Assigned:");
       		 wd.findElement(By.id("createAtrBtn")).click();
             logger.info("ATR Page Test case No 2 :Entered Valid Data");//Atr Page Not Created
             Thread.sleep(10000);
             redirect="Sucess";
		     return redirect;
	  
		
	}	
	
		
	}	
				
	
	   
		
		
		
	



