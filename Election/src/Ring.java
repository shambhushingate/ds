import java.util.*;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] process = new int[n];
        System.out.println("Enter process IDs (in ring order):");
        for (int i = 0; i < n; i++) {
            System.out.print("Position " + i + ": ");
            process[i] = sc.nextInt();
        }

        System.out.print("Enter initiator process index (0 to " + (n - 1) + "): ");
        int initiator = sc.nextInt();

        System.out.println("\n");
        System.out.println("         RING ELECTION ALGORITHM        ");
        System.out.println("Election started by Process "
                + process[initiator] + " (index " + initiator + ")");

        // Phase 1: ELECTION message travels the ring
        System.out.println("\n Phase 1: ELECTION Message Passing \n");

        int maxID = process[initiator];
        int current = (initiator + 1) % n; // start from next node

        // initiator sends its ID first
        System.out.println("Process " + process[initiator]
                + " sends ELECTION(" + process[initiator] + ")"
                + " to Process " + process[current]);

        // message travels around the ring
        while (current != initiator) {
            int received = maxID; // what this node received

            if (process[current] > maxID) {
                maxID = process[current]; // replace with own higher ID
            }

            int next = (current + 1) % n;

            if (next == initiator) {
                // last node sends back to initiator
                System.out.println("Process " + process[current]
                        + " receives ELECTION(" + received + ")"
                        + " → forwards ELECTION(" + maxID + ")"
                        + " to Process " + process[next]
                        + " [back to initiator]");
            } else {
                System.out.println("Process " + process[current]
                        + " receives ELECTION(" + received + ")"
                        + " → forwards ELECTION(" + maxID + ")"
                        + " to Process " + process[next]);
            }

            current = next;
        }

        // initiator receives message back — checks if its own ID won
        int coordinator = maxID;
        System.out.println("\nProcess " + process[initiator]
                + " receives ELECTION(" + coordinator + ") back.");
        System.out.println("Process " + process[initiator]
                + " recognizes Process " + coordinator
                + " as the winner!");

        // Phase 2: COORDINATOR message travels the ring
        System.out.println("\n");
        System.out.println(" Phase 2: COORDINATOR Message Passing \n");

        current = (initiator + 1) % n;

        System.out.println("Process " + process[initiator]
                + " sends COORDINATOR(" + coordinator + ")"
                + " to Process " + process[current]);

        while (current != initiator) {
            System.out.println("Process " + process[current]
                    + " receives COORDINATOR(" + coordinator + ")"
                    + " → updates leader = " + coordinator);
            int next = (current + 1) % n;
            if (next != initiator) {
                System.out.println("            forwards COORDINATOR("
                        + coordinator + ") to Process " + process[next]);
            }
            current = next;
        }

        System.out.println("Process " + process[initiator]
                + " receives COORDINATOR(" + coordinator
                + ") back → Election complete!");

        System.out.println("\n");
        System.out.println("  New Coordinator = Process " + coordinator);

        sc.close();
    }
}