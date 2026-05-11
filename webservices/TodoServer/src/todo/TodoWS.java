package todo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public class TodoWS {

    ArrayList<String> tasks =
            new ArrayList<String>();

    @WebMethod
    public String addTask(String task) {

        tasks.add(task);

        return "Task Added Successfully";
    }

    @WebMethod
    public String viewTasks() {

        return tasks.toString();
    }
}