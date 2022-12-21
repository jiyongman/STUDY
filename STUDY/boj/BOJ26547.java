package boj;
import java.util.*;

public class BOJ26547 { // Square

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] arr = sc.next().toCharArray();

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);

                for (int k = 1; k < arr.length - 1; k++) {
                    if (j == 0) {
                        System.out.print(arr[k]);
                    } else if (j == arr.length - 1) {
                        System.out.print(arr[arr.length - 1 - k]);
                    } else {
                        System.out.print(" ");
                    }
                }

                if (arr.length > 1) {
                    System.out.println(arr[arr.length - 1 - j]);
                } else {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}