// CalculatorClient.java
import CalculatorApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class CalculatorClient {
    static Calculator calcImpl;

    public static void main(String[] args) {
        try {
            // Step 1: Initialize the ORB
            ORB orb = ORB.init(args, null);

            // Step 2: Get the root naming context
            org.omg.CORBA.Object objRef =
                orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Step 3: Resolve the object reference in the naming service
            String name = "Calculator";
            calcImpl = CalculatorHelper.narrow(ncRef.resolve_str(name));

            System.out.println("=================================");
            System.out.println("   CORBA Calculator Client       ");
            System.out.println("=================================");

            double a = 20.0, b = 5.0;

            System.out.println("Numbers: a = " + a + ", b = " + b);
            System.out.println("---------------------------------");
            System.out.println("Addition       : " + calcImpl.add(a, b));
            System.out.println("Subtraction    : " + calcImpl.subtract(a, b));
            System.out.println("Multiplication : " + calcImpl.multiply(a, b));
            System.out.println("Division       : " + calcImpl.divide(a, b));
            System.out.println("=================================");

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}