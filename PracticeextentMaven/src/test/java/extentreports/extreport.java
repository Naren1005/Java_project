package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extreport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports exreport= new ExtentReports();
		ExtentSparkReporter sparkreport= new ExtentSparkReporter("D:\\Naren-java work space\\PracticeextentMaven\\\\repeorts\\report.html");
		exreport.attachReporter(sparkreport);
		
		ExtentTest test1=exreport.createTest("Test1");
		test1.pass("This test is passed");

		ExtentTest test2=exreport.createTest("Test2");
		test2.log(Status.FAIL, "this test is failed");
		exreport.createTest("test3").log(Status.SKIP,"this test is skipped");
		exreport.flush();
	}

}
