// file publishes the Calculator service to the network so clients can find and use it.import CalculatorApp.*;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null); //ORB Initialization middleware

            POA rootpoa = POAHelper.narrow( //Activate POA = Portable Object Adapter
            								//connects servant objects to ORB
                orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            CalculatorImpl calcImpl = new CalculatorImpl(); //Creates calculator service object.

            org.omg.CORBA.Object ref =
                rootpoa.servant_to_reference(calcImpl);
            Calculator href = CalculatorHelper.narrow(ref);

            org.omg.CORBA.Object objRef =
                orb.resolve_initial_references("NameService");
            NamingContextExt ncRef =
                NamingContextExtHelper.narrow(objRef);

            String name = "Calculator";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href); //Registers object using name So clients can locate it.

            System.out.println("=================================");
            System.out.println("  Calculator Server is Running   ");
            System.out.println("=================================");

            orb.run(); //Wait for Calls:

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace();
        }
    }
}
//Starts CORBA server and registers calculator object with Naming Service.