package calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService //Converts class into SOAP web service.
public class CalculatorWS {

    @WebMethod //Makes methods accessible remotely.
    public int add(int a, int b) {
        return a + b;
    }

    @WebMethod
    public int subtract(int a, int b) {
        return a - b;
    }

    @WebMethod
    public int multiply(int a, int b) {
        return a * b;
    }

    @WebMethod
    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}









/*This file contains the actual business logic of the calculator application.

It provides services like:

Addition
Subtraction
Multiplication
Division

to remote clients through SOAP web service.

Main Functions
Defines web service methods
Processes client requests
Returns results to client
Important Annotations
@WebService

Converts class into SOAP web service.

@WebMethod

Makes methods accessible remotely.*/