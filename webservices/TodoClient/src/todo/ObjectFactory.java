
package todo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the todo package. 
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

    private final static QName _ViewTasks_QNAME = new QName("http://todo/", "viewTasks");
    private final static QName _AddTaskResponse_QNAME = new QName("http://todo/", "addTaskResponse");
    private final static QName _AddTask_QNAME = new QName("http://todo/", "addTask");
    private final static QName _ViewTasksResponse_QNAME = new QName("http://todo/", "viewTasksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: todo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewTasks }
     * 
     */
    public ViewTasks createViewTasks() {
        return new ViewTasks();
    }

    /**
     * Create an instance of {@link AddTaskResponse }
     * 
     */
    public AddTaskResponse createAddTaskResponse() {
        return new AddTaskResponse();
    }

    /**
     * Create an instance of {@link AddTask }
     * 
     */
    public AddTask createAddTask() {
        return new AddTask();
    }

    /**
     * Create an instance of {@link ViewTasksResponse }
     * 
     */
    public ViewTasksResponse createViewTasksResponse() {
        return new ViewTasksResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://todo/", name = "viewTasks")
    public JAXBElement<ViewTasks> createViewTasks(ViewTasks value) {
        return new JAXBElement<ViewTasks>(_ViewTasks_QNAME, ViewTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://todo/", name = "addTaskResponse")
    public JAXBElement<AddTaskResponse> createAddTaskResponse(AddTaskResponse value) {
        return new JAXBElement<AddTaskResponse>(_AddTaskResponse_QNAME, AddTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://todo/", name = "addTask")
    public JAXBElement<AddTask> createAddTask(AddTask value) {
        return new JAXBElement<AddTask>(_AddTask_QNAME, AddTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://todo/", name = "viewTasksResponse")
    public JAXBElement<ViewTasksResponse> createViewTasksResponse(ViewTasksResponse value) {
        return new JAXBElement<ViewTasksResponse>(_ViewTasksResponse_QNAME, ViewTasksResponse.class, null, value);
    }

}
