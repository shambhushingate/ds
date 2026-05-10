import java.util.*;

public class Bully {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] process = new int[n];
        System.out.println("Enter process IDs:");
        for (int i = 0; i < n; i++) {
            process[i] = sc.nextInt();
        }

        System.out.print("Enter the process ID that detects coordinator failure: ");
        int initiator = sc.nextInt();

        System.out.println("\n");
        System.out.println("         BULLY ELECTION ALGORITHM       ");
        System.out.println("\n");
        System.out.println("Election started by Process " + initiator);

        int coordinator = initiator;

        // Each process sends ELECTION to all higher processes
        // Higher processes respond with OK and take over
        for (int i = 0; i < n; i++) {
            if (process[i] > coordinator) {

                // current coordinator candidate sends ELECTION to higher process
                System.out.println("\nProcess " + coordinator
                        + " sends ELECTION to Process " + process[i]);

                // higher process responds with OK
                System.out.println("Process " + process[i]
                        + " sends OK to Process " + coordinator);

                // higher process takes over as new candidate
                System.out.println("Process " + coordinator
                        + " steps down. Process " + process[i]
                        + " takes over the election.");

                coordinator = process[i]; // new candidate
            }
        }

        // Winner sends COORDINATOR message to all processes
        System.out.println("\n");
        System.out.println("Process " + coordinator
                + " gets no response — it is the highest alive process.");
        System.out.println("\nProcess " + coordinator
                + " sends COORDINATOR message to all processes:");

        for (int i = 0; i < n; i++) {
            if (process[i] != coordinator) {
                System.out.println("  COORDINATOR(" + coordinator
                        + ") ──► Process " + process[i]);
            }
        }

        System.out.println("\n");
        System.out.println("  New Coordinator = Process " + coordinator);

        sc.close();
    }
}