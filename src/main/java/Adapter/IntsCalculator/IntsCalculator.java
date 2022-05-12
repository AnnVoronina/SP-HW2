package Adapter.IntsCalculator;

import Adapter.Calculator.Calculator;
import Adapter.Calculator.Operation;

public class IntsCalculator implements Ints {
    Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {


        return (int) calculator.newFormula().addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculator.newFormula().addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg0, int arg1) {
        return (int) calculator.newFormula().addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.POW)
                .result();
    }
}
