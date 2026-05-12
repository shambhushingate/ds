//Starts RMI server and registers remote object in RMI Registry.

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();

  
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("HelloService", obj); //Registers object with given name

            System.out.println("Server is running...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}