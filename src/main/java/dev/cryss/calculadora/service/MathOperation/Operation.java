package dev.cryss.calculadora.service.MathOperation;


public interface Operation<T> {
    T calculate(T number1, T number2);
    
}
