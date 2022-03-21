package Calculator;

import Calculator.Data.Operand;
import Calculator.Data.Operator;
import Calculator.Data.Token;
import Calculator.Exceptions.MalformedExpressionException;
import collections.Exceptions.EmptyStackException;
import collections.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator{
    private LinkedStack<Token> tokenStack;


    public CalculatorVisitor(){
        tokenStack = new LinkedStack<>();
    }


    @Override
    public int getResult() throws MalformedExpressionException {
        try {
            return ((Operand)tokenStack.pop()).getValue();
        } catch (EmptyStackException e) {
            throw new MalformedExpressionException("The expression was malformed :(");
        }
    }

    @Override
    public void visit(Operand operand) {
        tokenStack.push(operand);
    }

    @Override
    public void visit(Operator operator) {
        try {
            Operand b = (Operand) tokenStack.pop();
            Operand a = (Operand) tokenStack.pop();
            tokenStack.push(new Operand(operator.getOperation().calculate(a.getValue(), b.getValue())));

        } catch (EmptyStackException e) {
            e.printStackTrace();
        }


    }
}
