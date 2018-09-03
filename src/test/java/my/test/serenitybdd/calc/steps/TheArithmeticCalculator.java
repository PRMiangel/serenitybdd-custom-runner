package my.test.serenitybdd.calc.steps;

import my.test.serenitybdd.calc.ArithmeticCalculator;
import net.serenitybdd.screenplay.Ability;

public class TheArithmeticCalculator implements Ability {

    ArithmeticCalculator arithmeticCalculator;

    public TheArithmeticCalculator() {
        arithmeticCalculator = new ArithmeticCalculator();
    }

    public static TheArithmeticCalculator open() {
        return new TheArithmeticCalculator();
    }
}
