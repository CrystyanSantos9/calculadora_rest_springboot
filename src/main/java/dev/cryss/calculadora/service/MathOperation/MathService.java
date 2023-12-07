package dev.cryss.calculadora.service.MathOperation;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public Double sum(Double number1, Double number2) {
        return new OperationSumImpl ().calculate (number1, number2);
    }

    public Double subtraction(Double number1, Double number2) {
        return new OperationSubImpl ().calculate (number1, number2);
    }

    public Double multiplication(Double number1, Double number2) {
        return new OperationMultImpl ().calculate (number1, number2);
    }

    public Double division(Double number1, Double number2) {
        return new OperationDivImpl ().calculate (number1, number2);
    }

    public Double mean(Double number1, Double number2) {
        return new OperationMeanImpl ().calculate (number1, number2);
    }

    public Double sqrt(Double number1) {
        return new OperationSqrtRootImpl ().calculate (number1);
    }
}
