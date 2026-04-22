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

        System.out.print("Enter process that detects failure: ");
        int initiator = sc.nextInt();

        System.out.println("\nElection process started...\n");

        int max = initiator;
        for (int i = 0; i < n; i++) {
            if (process[i] > max) {
                System.out.println("Process " + initiator 
                                 + " sends message to " + process[i]);
                max = process[i];
            }
        }

        System.out.println("\nProcess " + max 
                         + " becomes the new coordinator");
        sc.close();
    }
}