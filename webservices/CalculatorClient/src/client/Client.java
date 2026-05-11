package client;

import calculator.CalculatorWS;
import calculator.CalculatorWSService;

public class Client {

    public static void main(String[] args) {

        CalculatorWSService service =
                new CalculatorWSService();

        CalculatorWS proxy =
                service.getCalculatorWSPort();

        System.out.println("Addition = " +
                proxy.add(10, 5));

        System.out.println("Subtraction = " +
                proxy.subtract(10, 5));

        System.out.println("Multiplication = " +
                proxy.multiply(10, 5));

        System.out.println("Division = " +
                proxy.divide(10, 5));
    }
}