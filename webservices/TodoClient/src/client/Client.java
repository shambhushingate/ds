package client;

import todo.TodoWS;
import todo.TodoWSService;

public class Client {

    public static void main(String[] args) {

        TodoWSService service =
                new TodoWSService();

        TodoWS proxy =
                service.getTodoWSPort();

        System.out.println(
                proxy.addTask("Complete Assignment")
        );

        System.out.println(
                proxy.addTask("Prepare for Exam")
        );

        System.out.println(
                "Task List: "
                + proxy.viewTasks()
        );
    }
}