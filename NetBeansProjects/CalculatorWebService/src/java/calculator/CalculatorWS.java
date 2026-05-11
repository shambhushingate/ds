package calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    @WebMethod(operationName = "add")
    public double add(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
        System.out.println("add called: " + a + " + " + b);
        return a + b;
    }

    @WebMethod(operationName = "subtract")
    public double subtract(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
        System.out.println("subtract called: " + a + " - " + b);
        return a - b;
    }

    @WebMethod(operationName = "multiply")
    public double multiply(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
        System.out.println("multiply called: " + a + " * " + b);
        return a * b;
    }

    @WebMethod(operationName = "divide")
    public double divide(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        System.out.println("divide called: " + a + " / " + b);
        return a / b;
    }
}