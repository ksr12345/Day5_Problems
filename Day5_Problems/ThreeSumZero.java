import java.util.*;

public class ThreeSumZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        List<List<Integer>> triplets = findTriplets(arr);

        System.out.println("Number of distinct triplets that sum up to zero: " + triplets.size());

        System.out.println("Distinct triplets:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet.get(0) + ", " + triplet.get(1) + ", " + triplet.get(2));
        }

        scanner.close();
    }

    private static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 1; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (k > j + 1 && arr[k] == arr[k - 1]) {
                        continue;
                    }
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        triplets.add(triplet);
                    }
                }
            }
        }

        return triplets;
    }
}