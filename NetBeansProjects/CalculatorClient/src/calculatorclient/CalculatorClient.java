package calculatorclient;

public class CalculatorClient {
    public static void main(String[] args) {

        // Create service instance
        calculator.CalculatorWS_Service service =
            new calculator.CalculatorWS_Service();

        // Get port
        calculator.CalculatorWS port = 
            service.getCalculatorWSPort();

        // Test values
        double a = 20.0;
        double b = 5.0;

        System.out.println("=================================");
        System.out.println("   Calculator Web Service Client  ");
        System.out.println("=================================");
        System.out.println("Numbers: a = " + a + ", b = " + b);
        System.out.println("---------------------------------");

        // Call web service operations
        double addResult      = port.add(a, b);
        double subtractResult = port.subtract(a, b);
        double multiplyResult = port.multiply(a, b);
        double divideResult   = port.divide(a, b);

        System.out.println("Addition       : " + addResult);
        System.out.println("Subtraction    : " + subtractResult);
        System.out.println("Multiplication : " + multiplyResult);
        System.out.println("Division       : " + divideResult);
        System.out.println("=================================");
    }
}