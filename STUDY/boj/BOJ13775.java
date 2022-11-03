package boj;
import java.util.*;

public class BOJ13775 { // Virus

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.nextLine()); // the key
        char[] arr = sc.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] += 26 - K;
                K++;

                if (arr[i] > 'z') {
                    arr[i] -= 26;
                }

                if (K > 25) {
                    K = 1;
                }
            }

            System.out.print(arr[i]);
        }

        sc.close();
    }
}