import calculator.Calculator;
import calculator.Calculatorimp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String op = "";
        double firstnum;
        String operator;
        double secondnum;
        Calculator calculate = new Calculatorimp();
        while (true) {
            try {
                System.out.println("Enter expression as val<space>op<space>val");
                firstnum = scan.nextInt();
                operator = scan.next();
                secondnum = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Input entered in wrong format please enter as value<space>operator<space>value");
                scan = new Scanner(System.in);
                continue;
            }
            calculate.setFirstvalue(firstnum);
            calculate.setSecondvalue(secondnum);
            calculate.setOperator(operator);
            try {
                System.out.println(calculate.getFirstvalue() + " " + calculate.getOperator() + " " + calculate.getSecondvalue() + " = " + calculate.getCalculationResult());
            } catch (Exception e) {
                System.out.println("Invalid operator exited");
            }
            System.out.println("Do you want to continue yes/no");
            scan.nextLine();
            op = scan.nextLine();
            if (!op.equals("yes"))
                break;
        }
        return;

    }
}