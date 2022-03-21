package Calculator;

import Calculator.Data.Operand;
import Calculator.Data.Operation;
import Calculator.Data.Operator;
import Calculator.Data.Token;
import Calculator.Exceptions.MalformedExpressionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    static Client client;
    static ArrayList<Token> tokens;
    @BeforeEach
    void setup(){
        client = new Client();
        tokens = new ArrayList<>();
        Operand operand = new Operand(6);
        tokens.add(operand);

        Operand operand1 = new Operand(5);
        tokens.add(operand1);

        Operand operand2 = new Operand(2);
        tokens.add(operand2);

        Operand operand3 = new Operand(3);
        tokens.add(operand3);

        Operator operator = new Operator(Operation.PLUS);
        tokens.add(operator);

        Operand operand4 = new Operand(8);
        tokens.add(operand4);

        Operator operator1 = new Operator(Operation.TIMES);
        tokens.add(operator1);

        Operator operator2 = new Operator(Operation.PLUS);
        tokens.add(operator2);

        Operand operand5 = new Operand(3);
        tokens.add(operand5);

        Operator operator3 = new Operator(Operation.PLUS);
        tokens.add(operator3);

        Operator operator4 = new Operator(Operation.TIMES);
        tokens.add(operator4);
    }

    @Test
    void evaluateExpression() throws MalformedExpressionException {
        assertEquals(288, client.evaluateExpression(tokens));
    }

    @Test
    void throwsMalformedException(){
        tokens.add(new Operator(Operation.PLUS));
        assertThrows(MalformedExpressionException.class, ()->{
            client.evaluateExpression(tokens);
        });
    }
}