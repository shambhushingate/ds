import CalculatorApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef =
                orb.resolve_initial_references("NameService");
            NamingContextExt ncRef =
                NamingContextExtHelper.narrow(objRef);

            Calculator calcImpl = CalculatorHelper.narrow(
                ncRef.resolve_str("Calculator"));

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
            e.printStackTrace();
        }
    }
}