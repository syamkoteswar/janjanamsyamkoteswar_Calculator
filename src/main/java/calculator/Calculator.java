package calculator;

public interface Calculator {
    public void setFirstvalue(double a);

    public void setSecondvalue(double a);

    public void setOperator(String a);

    public double getFirstvalue();

    public double getSecondvalue();

    public String getOperator();

    public double getCalculationResult() throws Exception;
}
