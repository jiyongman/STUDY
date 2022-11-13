package boj;
import java.util.*;

public class BOJ17795 { // Ballpark Estimate

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        if (arr.length == 1) {
            System.out.print(arr[0]);
        } else {
            if (arr[1] >= '5') {
                if (arr[0] == '9') {
                    System.out.print(10);
                } else {
                    System.out.print((char) (arr[0] + 1));
                }
            } else {
                System.out.print(arr[0]);
            }

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(0);
            }
        }

        sc.close();
    }
}