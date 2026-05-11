package todo;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8088/todo",
            new TodoWS()
        );

        System.out.println(
                "ToDo Web Service Started..."
        );
    }
}