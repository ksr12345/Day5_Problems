import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        System.out.print("Prime factors of " + N + ": ");

        findPrimeFactors(N);

        scanner.close();
    }

    public static void findPrimeFactors(int N) {
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }

        for (int i = 3; i * i <= N; i += 2) {

            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        if (N > 2) {
            System.out.print(N);
        }
    }
}
