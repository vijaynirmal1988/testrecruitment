package Recruitment;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.xdevapi.Statement;

public class TestDeleteData {

	final static Logger logger=Logger.getLogger(TestLoginPage.class);

	public static void testLogin(WebDriver wd) throws InterruptedException
	{
		
		testDeleteAtrData(wd);
		
		
}
	public static void testDeleteAtrData(WebDriver wd) throws InterruptedException
	{
		
		
		
		Connection conn = null;
		   java.sql.Statement stmt = null;
		   try{
		      
		      Class.forName("com.mysql.jdbc.Driver");

		      
		      conn = DriverManager.getConnection("http://localhost:3306/springbootdb,root");

		   
		      stmt = conn.createStatement();
		      String sql = "DELETE FROM atr WHERE id = 58" ;         
		      ((java.sql.Statement) stmt).executeUpdate(sql);

		      conn.close();
		
			
		   		}
		   catch (Exception e) {
			
		   }
		   Thread.sleep(2000);
		   wd.manage().window().maximize();
			
		wd.get("http://localhost:8080/rec/atr.html");
	}
}