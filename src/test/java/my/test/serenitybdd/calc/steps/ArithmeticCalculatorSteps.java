package my.test.serenitybdd.calc.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.test.serenitybdd.calc.ArithmeticCalculator;
import org.junit.Assert;

public class ArithmeticCalculatorSteps {

    ArithmeticCalculator arithmeticCalculator;

    @Given("(.*) opens the arithmetic calculator")
    public void open_the_arithmetic_calculator(String actorName) {
        arithmeticCalculator = new ArithmeticCalculator();
    }

    @When("he perform the arithmetic operation (.*)")
    public void perform_the_arithmetic_operation(String arithmeticOperation) {
        arithmeticCalculator.setOperation(arithmeticOperation);
        arithmeticCalculator.performOperation();
    }

    @Then("he should see the result (.*)")
    public void should_see_the_result(String result) {
        Assert.assertEquals(result, arithmeticCalculator.getResult());
    }
}
