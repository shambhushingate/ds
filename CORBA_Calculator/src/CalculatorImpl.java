// CalculatorImpl.java
import CalculatorApp.*;
import org.omg.CORBA.*;

public class CalculatorImpl extends CalculatorPOA {

    @Override
    public double add(double a, double b) {
        System.out.println("Server: add(" + a + ", " + b + ")");
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        System.out.println("Server: subtract(" + a + ", " + b + ")");
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        System.out.println("Server: multiply(" + a + ", " + b + ")");
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        System.out.println("Server: divide(" + a + ", " + b + ")");
        return a / b;
    }
}