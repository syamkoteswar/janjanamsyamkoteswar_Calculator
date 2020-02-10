package calculator;

import calculator.Operations.*;

public class Calculatorimp implements Calculator {
    private double firstnum;
    private double secondnum;
    private String operator;
    private Arithmatic[] operration = {new Addition(), new Subtraction(), new Division(), new Multiplication()};
    private String[] op = {"+", "-", "/", "*"};

    public Calculatorimp() {
    }

    @Override
    public void setFirstvalue(double firstnum) {
        this.firstnum = firstnum;
    }

    @Override
    public void setSecondvalue(double secondnum) {
        this.secondnum = secondnum;
    }

    @Override
    public void setOperator(String a) {
        this.operator = a;
    }

    @Override
    public double getFirstvalue() {
        return firstnum;
    }

    @Override
    public double getSecondvalue() {
        return secondnum;
    }

    @Override
    public String getOperator() {
        return operator;
    }

    @Override
    public double getCalculationResult() throws Exception {
        double result;
        int val = 0;
        for (int iter = 0; iter < op.length; ++iter) {
            if (operator.equals(op[iter])) {
                val = iter;
                break;
            }
        }
        if (val == 0 && !operator.equals(op[val]))
            val = op.length;
        try {
            return operration[val].calculate(firstnum, secondnum);
        } catch (Exception e) {
            throw e;
        }
    }
}
