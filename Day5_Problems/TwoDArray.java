import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        Object[][] array = new Object[M][N];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                if (scanner.hasNextInt()) {
                    array[i][j] = scanner.nextInt();
                } else if (scanner.hasNextDouble()) {
                    array[i][j] = scanner.nextDouble();
                } else if (scanner.hasNextBoolean()) {
                    array[i][j] = scanner.nextBoolean();
                } else {
                    System.out.println("Invalid input. Expected integer, double, or boolean.");
                    return;
                }
            }
        }

        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        writer.println("The 2D array is:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();

        scanner.close();
        writer.close();
    }
}

