import CalculatorApp.*;
import org.omg.CORBA.*;

public class CalculatorImpl extends CalculatorPOA {

    public double add(double a, double b) {
        System.out.println("Server: add(" + a + ", " + b + ")");
        return a + b;
    }

    public double subtract(double a, double b) {
        System.out.println("Server: subtract(" + a + ", " + b + ")");
        return a - b;
    }

    public double multiply(double a, double b) {
        System.out.println("Server: multiply(" + a + ", " + b + ")");
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        System.out.println("Server: divide(" + a + ", " + b + ")");
        return a / b;
    }
}