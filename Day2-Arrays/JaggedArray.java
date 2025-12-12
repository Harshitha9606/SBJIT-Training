package Day2;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) 
        {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();

            jagged[i] = new int[cols]; 

            System.out.println("Enter " + cols + " elements:");
            for (int j = 0; j < cols; j++)
            {
                jagged[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nJagged Array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
