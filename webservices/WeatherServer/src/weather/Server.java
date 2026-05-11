package weather;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8888/weather",
            new WeatherWS()
        );

        System.out.println("Weather Web Service Started...");
    }
}