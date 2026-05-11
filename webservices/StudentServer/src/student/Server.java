package student;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:9098/student",
            new StudentWS()
        );

        System.out.println(
                "Student Web Service Started..."
        );
    }
}