import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/src/test/resources/features/WebCase.feature:10"},
        plugin = {"testng:C:/Users/beyaz/Documents/GitHub/kloiaCaseUI/target/cucumber-parallel/1.xml"},
        monochrome = false,
        glue = {"steps"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
