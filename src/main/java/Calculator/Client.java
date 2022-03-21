package Calculator;

import Calculator.Data.Token;
import Calculator.Exceptions.MalformedExpressionException;

import java.util.ArrayList;

public class Client {
    private CalculatorVisitor calculatorVisitor;

    public int evaluateExpression(ArrayList<Token> tokenList) throws MalformedExpressionException {
        calculatorVisitor = new CalculatorVisitor();
        for (Token token : tokenList){
            token.accept(calculatorVisitor);
        }

        return calculatorVisitor.getResult();
        }
}
