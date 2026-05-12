//Acts as client application accessing remote service.
// finds the remote object in the registry and calls its method 

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client {
public static void main(String[] args) {
try {
Registry registry = LocateRegistry.getRegistry("localhost");
Hello stub = (Hello) registry.lookup("HelloService"); //Finds object registered under name "HelloService
System.out.println(stub.sayHello()); //Call Remote Method:
} catch (Exception e) {
e.printStackTrace();
}
}
}