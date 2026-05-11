
package student;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the student package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStudent_QNAME = new QName("http://student/", "getStudent");
    private final static QName _ViewStudentsResponse_QNAME = new QName("http://student/", "viewStudentsResponse");
    private final static QName _AddStudentResponse_QNAME = new QName("http://student/", "addStudentResponse");
    private final static QName _ViewStudents_QNAME = new QName("http://student/", "viewStudents");
    private final static QName _GetStudentResponse_QNAME = new QName("http://student/", "getStudentResponse");
    private final static QName _AddStudent_QNAME = new QName("http://student/", "addStudent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link ViewStudents }
     * 
     */
    public ViewStudents createViewStudents() {
        return new ViewStudents();
    }

    /**
     * Create an instance of {@link ViewStudentsResponse }
     * 
     */
    public ViewStudentsResponse createViewStudentsResponse() {
        return new ViewStudentsResponse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "viewStudentsResponse")
    public JAXBElement<ViewStudentsResponse> createViewStudentsResponse(ViewStudentsResponse value) {
        return new JAXBElement<ViewStudentsResponse>(_ViewStudentsResponse_QNAME, ViewStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "viewStudents")
    public JAXBElement<ViewStudents> createViewStudents(ViewStudents value) {
        return new JAXBElement<ViewStudents>(_ViewStudents_QNAME, ViewStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://student/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

}
