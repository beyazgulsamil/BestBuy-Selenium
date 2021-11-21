import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/src/test/resources/features/WebCase.feature:45"},
        plugin = {"testng:C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/target/cucumber-parallel/4.xml"},
        monochrome = false,
        glue = {"steps"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
