package calculator;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(  //Publishes SOAP service on specified URL.
            "http://localhost:8085/calculator",
            new CalculatorWS()
        );

        System.out.println("Server Started...");
    }
}















/*Purpose

This file starts the server and publishes the SOAP web service on a URL.

Without this file:

Web service cannot run
Client cannot connect
Main Function
Endpoint.publish()

Publishes web service on network.

Example
Endpoint.publish(
    "http://localhost:8085/calculator",
    new CalculatorWS()
);

This makes service available to clients.

Responsibilities
Starts server
Hosts web service
Creates service endpoint
Generates WSDL automatically*/