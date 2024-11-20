import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example", // Adjust the package name for your step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)

public class Runner {

}

