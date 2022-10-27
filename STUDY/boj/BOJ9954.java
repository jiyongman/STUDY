package boj;
import java.util.*;

public class BOJ9954 { // Cedric's Cypher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            char[] arr = sc.nextLine().toCharArray();

            if (arr[0] == '#') {
                break;
            }

            for (int i = 0; i < arr.length - 1; i++) {
                int tmp = arr[arr.length - 1] - 'A';

                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] -= tmp;

                    if (arr[i] < 'a') {
                        arr[i] += 26;
                    }
                } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    arr[i] -= tmp;

                    if (arr[i] < 'A') {
                        arr[i] += 26;
                    }
                }

                System.out.print(arr[i]);
            }

            System.out.println();
        }

        sc.close();
    }
}