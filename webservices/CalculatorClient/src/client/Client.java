package client;

import calculator.CalculatorWS;
import calculator.CalculatorWSService;

public class Client {

    public static void main(String[] args) {

        CalculatorWSService service =
                new CalculatorWSService(); //Connects client to SOAP service.

        CalculatorWS proxy = //Client calls methods through proxy.
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




/*his file acts as client application.

It accesses the calculator web service remotely.

Main Functions
Connects to SOAP service
Sends requests
Receives responses
Displays output
Example
proxy.add(10, 5)

Client sends SOAP request to server.

Server returns result.

Responsibilities
Consumes web service
Uses generated proxy classes
Communicates with server*/