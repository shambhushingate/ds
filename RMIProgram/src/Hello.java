//It defines methods that client can call remotely.

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Hello extends Remote {
String sayHello() throws RemoteException; //Declares one remote method
}

//RMI (Remote Method Invocation) is a Java technology that allows one Java program to call methods of an object running on another machine remotely.