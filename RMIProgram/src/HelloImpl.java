//Implements actual logic of remote method.
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class HelloImpl extends UnicastRemoteObject implements Hello { //Implements the remote interface
protected HelloImpl() throws RemoteException {
super();
}
public String sayHello() throws RemoteException {
return "Hello from Server!";
}
}