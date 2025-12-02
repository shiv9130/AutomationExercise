package ListinerAE;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import FrameworkExceptionsAE.fileNotFoundException;
import UtilityAE.javaUtil;
import baseClassAE.baseClass;

public class extentReport implements ITestListener {
	
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	String Report_Name;
	javaUtil ju = new javaUtil();
	@Override
	public void onStart(ITestContext context) {
		String dt = ju.dtSshot();
		
		spark = new ExtentSparkReporter("./\\AutomationExercise\\reports\\report"+dt+".html");
		Report_Name = "Test_Report"+dt+".html";
		spark.config().setDocumentTitle("AutomationExercise");
		spark.config().setReportName("RegressionTesting");
		spark.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(spark);
		
		String bro = context.getCurrentXmlTest().getParameter("Browser");
		report.setSystemInfo("Browser", bro);
		
		String ops = context.getCurrentXmlTest().getParameter("os");
		report.setSystemInfo("os", ops);
		
		report.setSystemInfo("username",System.getProperty("user.name"));
		report.setSystemInfo("java", System.getProperty("java.version"));
		
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test =report.createTest(result.getMethod().getMethodName());
		test.assignCategory(result.getMethod().getGroups());
		test.pass("test passed sucessfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String dt = ju.dtSshot();
		test= report.createTest(result.getMethod().getMethodName());
		test.assignCategory(result.getMethod().getGroups());
		test.fail("test failed"+ result.getThrowable());
		
		TakesScreenshot ts = (TakesScreenshot) baseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("C:\\Users\\Nis\\Links\\AutomationExercise\\AutomationExercise\\ss"+dt+".png");
		try {
			FileHandler.copy(src, tgt);
		} catch (Exception e) {
			
			throw new fileNotFoundException("filenotfound"+e.getMessage());
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String dt = ju.dtSshot();
		test = report.createTest(result.getMethod().getMethodName());
		test.assignCategory(result.getMethod().getGroups());
		test.skip("test skipped"+result.getThrowable());
		
		TakesScreenshot ts = (TakesScreenshot) baseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("./AutomationExercise\\sshot\\ssh"+dt+".png");
		try {
			FileHandler.copy(src, tgt);
		} catch (Exception e) {
			
			throw new fileNotFoundException("filenotfound"+e.getMessage());
		}
		
		
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
		
	}
	
	

}
