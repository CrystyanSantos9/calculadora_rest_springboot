package dev.cryss.calculadora.service.MathOperation;

public class OperationSqrtRootImpl implements OperationOneInput<Double> {

    @Override
    public Double calculate(Double number1) {
        return Math.sqrt (number1);
    }
}
