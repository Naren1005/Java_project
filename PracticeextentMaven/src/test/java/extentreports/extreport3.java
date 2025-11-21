package extentreports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extreport3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports exreport= new ExtentReports();
		ExtentSparkReporter sparkreport= new ExtentSparkReporter("D:\\Naren-java work space\\PracticeextentMaven\\\\repeorts\\report.html");
		exreport.attachReporter(sparkreport);
		String xml1="<note>\r\n"
				+ "<to>Tove</to>\r\n"
				+ "<from>Jani</from>\r\n"
				+ "<heading>Reminder</heading>\r\n"
				+ "<body>Don't forget me this weekend!</body>\r\n"
				+ "</note>";
		String json1="{\r\n"
				+ "    \"glossary\": {\r\n"
				+ "        \"title\": \"example glossary\",\r\n"
				+ "		\"GlossDiv\": {\r\n"
				+ "            \"title\": \"S\",\r\n"
				+ "			\"GlossList\": {\r\n"
				+ "                \"GlossEntry\": {\r\n"
				+ "                    \"ID\": \"SGML\",\r\n"
				+ "					\"SortAs\": \"SGML\",\r\n"
				+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
				+ "					\"Acronym\": \"SGML\",\r\n"
				+ "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
				+ "					\"GlossDef\": {\r\n"
				+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
				+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n"
				+ "                    },\r\n"
				+ "					\"GlossSee\": \"markup\"\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";
		
		
		List<String> list1=new ArrayList<>();
		list1.add("Narendra"); 
			list1.add("Hema");
		list1.add("Lalitha");
		list1.add("Vindhya");
		
		Map<Integer, String> map1=new HashMap<>();
		map1.put(101, "Narendra");
		map1.put(102, "Hema");
		map1.put(103, "Lalitha");
		map1.put(104, "Vindhya");
		
		exreport.createTest("Xmlformat").info(MarkupHelper.createCodeBlock(xml1, CodeLanguage.XML));	
		exreport.createTest("jason based test").log(Status.INFO,MarkupHelper.createCodeBlock(json1,CodeLanguage.JSON));
		
		//Collection data
		exreport.createTest("List data").log(Status.INFO,MarkupHelper.createUnorderedList(list1));
		exreport.createTest("List data").log(Status.INFO,MarkupHelper.createOrderedList(list1));
		
		exreport.createTest("Map data").log(Status.INFO,MarkupHelper.createUnorderedList(map1));
		exreport.createTest("Map data").log(Status.INFO,MarkupHelper.createOrderedList(map1));
		//High lighter 
		exreport.createTest("ct not  highlighted ","this test is for highlighting").info("info not highlighted");
		exreport.createTest("highlighted").log(Status.INFO,MarkupHelper
				.createLabel("This is  a highlighted message",ExtentColor.RED));
		
		// exception
		try {
			int a=5/0;
		} catch (Exception e) {

exreport.createTest("exception:").info(e).fail(e);

Throwable t= new RuntimeException("this is a custome exception");

exreport.createTest("custome exception").info(t).fail(t);

		}
		
		
		
		
// TEST status will be based on the below log status order. it is recommended to use one log status for one test.
//		FAIL
//		SKIP
//		WARNING
//		PASS
//		INFO
		
		exreport.flush();
	}

}
