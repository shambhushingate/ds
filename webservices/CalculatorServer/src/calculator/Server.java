package calculator;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8085/calculator",
            new CalculatorWS()
        );

        System.out.println("Server Started...");
    }
}