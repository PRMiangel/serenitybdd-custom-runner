package my.test.serenitybdd.calc.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"classpath:features/the_arithmetic_calculator.feature"},
        glue     = {"classpath:my.test.serenitybdd.calc.steps"},
        junit    = {"--filename-compatible-names"}
)
public class TestRunner {
}
