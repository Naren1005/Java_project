package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extreport2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports exreport= new ExtentReports();
		ExtentSparkReporter sparkreport= new ExtentSparkReporter("D:\\Naren-java work space\\PracticeextentMaven\\\\repeorts\\report.html");
		exreport.attachReporter(sparkreport);
		
		
// TEST status will be based on the below log status order. it is recommended to use one log status for one test.
//		fAIL
//		SKIP
//		WARNING
//		PASS
//		INFO
		exreport.createTest("test1")
		.log(Status.SKIP,"this test is skipped")
		.log(Status.INFO,"<b><i>this test is INFO</b></i>")
		.log(Status.PASS,"<i>this test is PASS</i>")
		.log(Status.FAIL,"this test is fAIL")
		.log(Status.FAIL,"this test is FAIL")
		.log(Status.WARNING,"this test is WARNING")
		;
		exreport.flush();
	}

}
