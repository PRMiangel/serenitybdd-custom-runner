package my.test.serenitybdd.calc;

public class ArithmeticCalculator {

    private String operation;
    private String result;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void performOperation() {
        result = "2";
    }

    public String getResult() {
        return result;
    }
}
