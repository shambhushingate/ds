import mpi.*;

public class MPISum {
    public static void main(String args[]) throws Exception {

        MPI.Init(args);

        int rank = MPI.COMM_WORLD.Rank();   // processor id
        int size = MPI.COMM_WORLD.Size();   // total processors

        int N = 17;                          // total elements
        int[] data = new int[N];
        int elementsPerProcess = N / size;
        int[] subArray = new int[elementsPerProcess];

        // Master process
        if (rank == 0) {
            // Initialize array with 1 to N
            for (int i = 0; i < N; i++) {
                data[i] = i + 1;
            }
            System.out.println("Master: Array initialized: ");
            for (int val : data) System.out.print(val + " ");
            System.out.println();

            // Send parts to other processors
            for (int i = 1; i < size; i++) {
                MPI.COMM_WORLD.Send(data, i * elementsPerProcess,
                                    elementsPerProcess, MPI.INT, i, 0);
                System.out.println("Master: Sent elements to Process " + i);
            }

            // Copy its own part
            System.arraycopy(data, 0, subArray, 0, elementsPerProcess);

        } else {
            // Receive sub array from master
            MPI.COMM_WORLD.Recv(subArray, 0, elementsPerProcess,
                                MPI.INT, 0, 0);
        }

        // Calculate local sum
        int localSum = 0;
        for (int i = 0; i < elementsPerProcess; i++) {
            localSum += subArray[i];
        }

        System.out.println("Process " + rank + " handles elements: "
            + java.util.Arrays.toString(subArray)
            + "  =>  Partial Sum = " + localSum);

        // Gather results at master using Reduce
        int[] total = new int[1];
        MPI.COMM_WORLD.Reduce(new int[]{localSum}, 0,
                              total, 0, 1, MPI.INT, MPI.SUM, 0);

        // Master prints final result
        if (rank == 0) {
            System.out.println("================================");
            System.out.println("Final Sum of all elements = " + total[0]);
            System.out.println("================================");
        }

        MPI.Finalize();
    }
}