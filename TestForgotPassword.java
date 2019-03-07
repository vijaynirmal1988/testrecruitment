package Recruitment;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestForgotPassword {

	final static Logger logger=Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME +   "/rec/forgot-password.html";
	public static void testForgotPassword(WebDriver wd) throws InterruptedException
	
	{
		testPositiveForgotPassword(wd);
		//testNegativeForgotPassword(wd);
	
}
	
	//test case 7----
	public static String testPositiveForgotPassword(WebDriver wd) throws InterruptedException
	{
		String redirect ="";
		wd.manage().window().maximize();
		wd.get(UserURL);
		wd.findElement(By.id("inputEmail")).sendKeys("vijaynirmal@gmail.com");
		logger.info("Email entered:vijaynirmal@gmail.com");
		wd.findElement(By.id("butreset")).click();
		logger.info("Button Click: Reset Password Page Entered");
	    wd.findElement(By.id("inputPassword")).sendKeys("vijay123");
	    logger.info("Password entered:vijay123");
	    wd.findElement(By.id("inputRepassword")).sendKeys("vijay123");
	    logger.info("Password entered:vijay123");
	    wd.findElement(By.id("butChange")).click();
		logger.info("Forgot page test case 7:password change sucessfully"); //password change sucessfully
		redirect="success";
		return redirect;
		
}
}