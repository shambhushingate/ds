package student;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.HashMap;

@WebService
public class StudentWS {

    HashMap<Integer, String> students = //Stores student records in key-value format.
            new HashMap<Integer, String>();

    @WebMethod
    public String addStudent(int rollNo,
                             String name) {

        students.put(rollNo, name);

        return "Student Added Successfully";
    }

    @WebMethod
    public String getStudent(int rollNo) {

        if(students.containsKey(rollNo)) {

            return "Roll No: "
                    + rollNo
                    + " Name: "
                    + students.get(rollNo);
        }

        else {

            return "Student Not Found";
        }
    }

    @WebMethod
    public String viewStudents() {

        return students.toString();
    }
}