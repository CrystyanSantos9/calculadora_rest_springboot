package dev.cryss.calculadora.service.MathOperation;

public class OperationMeanImpl implements Operation<Double> {

    @Override
    public Double calculate(Double number1, Double number2) {
        return (number1 + number2) / 2;
    }
}
