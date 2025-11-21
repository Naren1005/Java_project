package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions  (features= "src/test/java/features/",glue="stepdefination",monochrome=true,tags="@Placeorder")
public class testrunnerprodcutsearch extends AbstractTestNGCucumberTests{

}
