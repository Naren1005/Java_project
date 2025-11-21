package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features",
glue="stepDefination",monochrome=true)
//,tags="@RegressionTest",plugin= {"pretty","html:target/cucumber.html"})
public class testrunner extends AbstractTestNGCucumberTests{

}
