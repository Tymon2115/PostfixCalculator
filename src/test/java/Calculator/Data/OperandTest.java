package Calculator.Data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    static int value;

    @BeforeAll
    static void setup(){
        value = 10;
    }

    @Test
    void getValue() {
        Operand operand = new Operand(value);
        Assertions.assertEquals(value, operand.getValue());
    }
}