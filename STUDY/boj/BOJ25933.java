package boj;
import java.util.*;

public class BOJ25933 { // Medal Ranking

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < n; i++) {
            int usa = 0;
            int russia = 0;

            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt(); // the gold, silver, and bronze medal counts for USA
                usa += arr[j];

                System.out.printf("%d ", arr[j]);
            }
            for (int j = 0; j < 3; j++) {
                arr2[j] = sc.nextInt(); // the gold, silver, and bronze medal counts for Russia
                russia += arr2[j];

                System.out.printf("%d ", arr2[j]);
            }

            System.out.println();

            if (usa > russia) {
                if (arr[0] > arr2[0] || (arr[0] == arr2[0] && arr[1] > arr2[1]) || (arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] > arr2[2])) {
                    System.out.println("both");
                } else {
                    System.out.println("count");
                }
            } else {
                if (arr[0] > arr2[0] || (arr[0] == arr2[0] && arr[1] > arr2[1]) || (arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] > arr2[2])) {
                    System.out.println("color");
                } else {
                    System.out.println("none");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}