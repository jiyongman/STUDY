package boj;
import java.util.*;

public class BOJ11596 { // Triangle

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if (arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] == arr2[2] && arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}