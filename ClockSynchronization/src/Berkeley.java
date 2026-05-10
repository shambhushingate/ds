import java.util.*;

public class Berkeley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes (including master): ");
        int n = sc.nextInt();

        int[] time = new int[n];

        System.out.println("Enter time for each node in Minutes:");
        System.out.print("Master Node (Node 1): ");
        time[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Slave Node " + i + " (Node " + (i + 1) + "): ");
            time[i] = sc.nextInt();
        }

        // Display initial clock values
        System.out.println("\n--- Initial Clock Values ---");
        System.out.println("Master Clock (Node 1): " + time[0] + " Minutes");
        for (int i = 1; i < n; i++) {
            System.out.println("Slave  " + i + "      (Node " + (i + 1) + "): " + time[i] + " Minutes");
        }

        // Step 1: Calculate average time
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += time[i];
        }
        int avg = sum / n;
        System.out.println("\nAverage time: " + avg + " Minutes");

        // Step 2: Calculate adjustments
        System.out.println("\nAdjustments for each node:");
        System.out.println("Master Node (Node 1) adjustment: " + (avg - time[0]) + " Minutes");
        for (int i = 1; i < n; i++) {
            int diff = avg - time[i];
            System.out.println("Slave  " + i + "      (Node " + (i + 1) + ") adjustment: " + diff + " Minutes");
        }

        // Step 3: Updated synchronized time
        System.out.println("\nSynchronized time for each node:");
        time[0] = avg;
        System.out.println("Master Clock (Node 1): " + time[0] + " Minutes");
        for (int i = 1; i < n; i++) {
            time[i] = avg;
            System.out.println("Slave  " + i + "      (Node " + (i + 1) + "): " + time[i] + " Minutes");
        }

        sc.close();
    }
}