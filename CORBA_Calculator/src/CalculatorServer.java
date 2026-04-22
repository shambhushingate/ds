// CalculatorServer.java
import CalculatorApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Step 1: Initialize the ORB
            ORB orb = ORB.init(args, null);

            // Step 2: Get reference to rootPOA and activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Step 3: Create the servant (implementation object)
            CalculatorImpl calcImpl = new CalculatorImpl();

            // Step 4: Get object reference from servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(calcImpl);
            Calculator href = CalculatorHelper.narrow(ref);

            // Step 5: Get the root naming context
            org.omg.CORBA.Object objRef =
                orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Step 6: Bind the object reference in the naming service
            String name = "Calculator";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("=================================");
            System.out.println("  Calculator Server is Running   ");
            System.out.println("=================================");

            // Step 7: Wait for invocations
            orb.run();

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
        System.out.println("CalculatorServer Exiting...");
    }
}