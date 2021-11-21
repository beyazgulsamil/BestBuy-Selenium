import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/src/test/resources/features/WebCase.feature:60"},
        plugin = {"testng:C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/target/cucumber-parallel/5.xml"},
        monochrome = false,
        glue = {"steps"})
public class Parallel05IT extends AbstractTestNGCucumberTests {
}
