package client;

import student.StudentWS;
import student.StudentWSService;

public class Client {

    public static void main(String[] args) {

        StudentWSService service =
                new StudentWSService();

        StudentWS proxy =
                service.getStudentWSPort();

        System.out.println(
                proxy.addStudent(
                        1,
                        "Rahul"
                )
        );

        System.out.println(
                proxy.addStudent(
                        2,
                        "Priya"
                )
        );

        System.out.println(
                proxy.getStudent(1)
        );

        System.out.println(
                proxy.getStudent(2)
        );

        System.out.println(
                "All Students: "
                + proxy.viewStudents()
        );
    }
}