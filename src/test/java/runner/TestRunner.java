package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;


@CucumberOptions(features = "src/test/java/features"
        , glue = {"steps"}
        ,plugin = {"pretty","html:target/report/report.html"})
public class TestRunner extends TestBase {
}
