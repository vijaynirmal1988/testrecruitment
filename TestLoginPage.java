package Recruitment;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TestLoginPage {
	
	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/login.html";

	public static void testLogin(WebDriver wd)
	{
		testPositiveCase(wd);
		
		}
	//test case no:1--
	public static void testPositiveCase(WebDriver wd) {
		
		wd.manage().window().maximize();
		
		wd.get(UserURL);
	    wd.findElement(By.id("inputEmail")).sendKeys("aljayabala@gmail.com");
	    logger.info("Email entered:aljayabala@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("jay123");
		logger.info("Password entered:jay123");
		wd.findElement(By.id("butlogin")).click();
		logger.info("loginPage Test case No :1 Login Sucessfully");//Login Sucessfully
		}
	
		public static void testWrongUserName(WebDriver wd) {
		wd.get("http://localhost:8080/login.html");
		wd.findElement(By.id("inputEmail")).sendKeys("aljayaba@gmail.com");
		logger.info("Email entered:aljayaba@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("jayabal1234");
		logger.info("Password entered:jayabal1234");
		wd.findElement(By.id("butlogin")).click();
		logger.info("Login Failed:Wrong Username");
		TestMain.quitApp(wd);
	}
	
    public static void testWrongPassword(WebDriver wd) {
    	wd.get("http://localhost:8080/login.html");
		wd.findElement(By.id("inputEmail")).sendKeys("aljayabala@gmail.com");
		logger.info("Email entered:aljayabala@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("jayab1234");
		logger.info("Password entered:jayab1234");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Wrong Password");
		TestMain.quitApp(wd);
	}
    
    public static void testWrongUserName1(WebDriver wd) {
    	wd.get("http://localhost:8080/login.html");
		wd.findElement(By.id("inputEmail")).sendKeys("aljayaba@gmail.com");
		logger.info("Email entered:aljayaba@gmail.com");
		wd.findElement(By.id("inputPassword")).sendKeys("jayabal123");
		logger.info("Email entered:jayabal123");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Wrong Username,Wrong Password");
		TestMain.quitApp(wd);
	}
    
    public static void testEmpty(WebDriver wd) {
    	wd.get("http://localhost:8080/login.html");
    	wd.findElement(By.id("inputEmail")).sendKeys("");
		logger.info("Email entered:blank space");
		wd.findElement(By.id("inputPassword")).sendKeys("");
		logger.info("Email entered:blank space");
		wd.findElement(By.id("butlogin")).click();
		logger.info("login Failed:Username,Password blank text field");
		TestMain.quitApp(wd);
	}
}
