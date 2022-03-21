package Calculator.Data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {



    @Test
    void getOperation() {
        for (Operation operation : Operation.values()){
            Operator operator = new Operator(operation);
            Assertions.assertEquals(operation, operator.getOperation());
        }


    }
}