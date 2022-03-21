package Calculator;

import Calculator.Data.Operand;
import Calculator.Data.Operator;

public interface Visitor {
    void visit(Operand operand);
    void visit(Operator operator);


}
