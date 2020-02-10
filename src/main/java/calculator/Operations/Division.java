package calculator.Operations;

public class Division implements Arithmatic {
    @Override
    public double calculate(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
}
