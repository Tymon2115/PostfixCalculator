package Calculator;

import Calculator.Exceptions.MalformedExpressionException;

public interface Calculator {
    int getResult() throws MalformedExpressionException;
}
