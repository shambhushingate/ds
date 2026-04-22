import java.util.*;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] process = new int[n];
        System.out.println("Enter process IDs:");
        for (int i = 0; i < n; i++) {
            process[i] = sc.nextInt();
        }

        System.out.print("Enter initiator process index (0 to n-1): ");
        int initiator = sc.nextInt();

        System.out.println("\nElection message passing:");

        int max = process[initiator];
        int i = initiator;

        do {
            System.out.println("Process " + process[i] 
                             + " passes election message");
            if (process[i] > max) {
                max = process[i];
            }
            i = (i + 1) % n;
        } while (i != initiator);

        System.out.println("\nProcess " + max + " becomes coordinator");
        sc.close();
    }
}