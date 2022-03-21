package Calculator;

import Calculator.Exceptions.MalformedExpressionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    static CalculatorVisitor calculatorVisitor = new CalculatorVisitor();

    @Test
    void getResultThrowsException() throws MalformedExpressionException {
      assertThrows(MalformedExpressionException.class, ()->{
          calculatorVisitor.getResult();

      });

    }
}