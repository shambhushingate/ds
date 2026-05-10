import java.util.*;

public class TokenRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] request = new int[n];

        System.out.println("Enter request status for each node"
                         + " (1 = wants CS, 0 = doesn't want CS):");
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + (i + 1) + ": ");
            request[i] = sc.nextInt();
        }

        System.out.print("Enter the node that initially has the token (1 to " + n + "): ");
        int token = sc.nextInt() - 1; // convert to 0-index

        // Show ring structure
        System.out.println("      TOKEN RING MUTUAL EXCLUSION       ");
        System.out.println("========================================");
        System.out.print("Ring Order : ");
        for (int i = 0; i < n; i++) {
            System.out.print("N" + (i + 1));
            if (i < n - 1) System.out.print(" --> ");
        }
        System.out.println(" --> N1 (back to start)");
        System.out.println("Token starts at Node " + (token + 1));
        System.out.println("========================================");

        // Token travels around the ring
        for (int i = 0; i < n; i++) {
            int current = (token + i) % n;       // current node
            int next    = (current + 1) % n;     // next node in ring (FIXED)

            System.out.println("\n[ Token at Node " + (current + 1) + " ]");

            if (request[current] == 1) {
                System.out.println("  --> Node " + (current + 1)
                                 + " NEEDS Critical Section.");
                System.out.println("  --> Node " + (current + 1)
                                 + " ENTERING Critical Section...");
                System.out.println("  --> Node " + (current + 1)
                                 + " EXECUTING in Critical Section...");
                System.out.println("  --> Node " + (current + 1)
                                 + " EXITING Critical Section.");
                request[current] = 0; // request fulfilled
            } else {
                System.out.println("  --> Node " + (current + 1)
                                 + " does NOT need Critical Section.");
            }

            System.out.println("  --> Token passed: N" + (current + 1)
                             + " --> N" + (next + 1));
        }

        System.out.println("\n========================================");
        System.out.println("   All nodes have been served. Done!    ");
        sc.close();
    }
}