import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "steps", tags = {
        "~@notImplemented" }, snippets = SnippetType.CAMELCASE)

public class CucumberRunner {
}