package currency;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:9095/currency",
            new CurrencyWS()
        );

        System.out.println(
                "Currency Web Service Started..."
        );
    }
}