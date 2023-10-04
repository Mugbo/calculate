package ie.atu.calculate;

import lombok.Getter;

@Getter
public class Calculator {

    public void setTotal(float total) {
        this.total = total;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private float total;

    private String operation;

    public Calculator(String operation, float total) {
        this.operation = operation;
        this.total = total;
    }

    public Calculator calculate(int num1, int num2, String operation) {
        this.operation = operation;

        this.total = switch (operation) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> (float) num1 / num2;
            default -> 0;
        };

        return new Calculator(this.operation, this.total);
    }
}

