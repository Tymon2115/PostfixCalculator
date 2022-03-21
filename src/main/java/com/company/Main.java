package com.company;


import Calculator.Client;
import Calculator.Data.Operand;
import Calculator.Data.Operation;
import Calculator.Data.Operator;
import Calculator.Data.Token;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        ArrayList<Token> tokens = new ArrayList<>();
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

        try {
            System.out.println((client.evaluateExpression(tokens)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
