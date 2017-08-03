package com.example.aaron.Calculator;

import static java.lang.Double.parseDouble;

/**
 * Created by aaron on 8/2/17.
 */

public class Calculations {
    String firstNumber;
    String SecondNumber;
    String Operand;

    public Calculations(String firstNumber, String secondNumber, String operand) {
        this.firstNumber = firstNumber;
        SecondNumber = secondNumber;
        Operand = operand;
    }

    public String getAnswer(Calculations passedProblem){
        double passedNumberOne = parseDouble(passedProblem.getFirstNumber());
        double passedNumberTwo = parseDouble(passedProblem.getSecondNumber());

        switch(passedProblem.getOperand()){
            case "ADD":
                return String.valueOf(passedNumberOne + passedNumberTwo);
            case "SUB":
                return String.valueOf(passedNumberOne - passedNumberTwo);
            case "MUL":
                return String.valueOf(passedNumberOne * passedNumberTwo);
            case "DIV":
                return String.valueOf(passedNumberOne / passedNumberTwo);
            case "MOD":
                return String.valueOf(passedNumberOne % passedNumberTwo);
            case "EXP":
                return String.valueOf(Math.pow(passedNumberOne,passedNumberTwo));
            default:
                return "ERROR";
        }
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        SecondNumber = secondNumber;
    }

    public String getOperand() {
        return Operand;
    }

    public void setOperand(String operand) {
        Operand = operand;
    }
}
