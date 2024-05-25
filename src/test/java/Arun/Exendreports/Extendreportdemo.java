package Arun.Exendreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreportdemo {
	ExtentReports ext;
	@BeforeTest
	public void config()
			{
		    String path=System.getProperty("user.dir")+"\\reports\\index.html";
		    String currentDir = System.getProperty("user.dir");
		    System.out.println("Current dir using System:" + currentDir);
		     ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		     reporter.config().setReportName("Web Automation Result");
		     	
		     ExtentReports ext=new ExtentReports();
		     ext.attachReporter(reporter);
		     ext.setSystemInfo("Tester", "Arun Vishwakarma");
		     ext.createTest("Initial Demo");
		     
		    		 
			}
	
	@Test
	public void initialdemo()
	{
		
		ext.createTest("Initial Demo");
		System.setProperty("webdriver.chorme.driver", "//Users//arun//Downloads//chromedriver-mac-x64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		ext.flush();
		
	}
	
	
}
