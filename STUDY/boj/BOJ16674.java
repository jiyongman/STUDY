package boj;
import java.util.*;

public class BOJ16674 { // 2018년을 되돌아보며

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] arr = new int[10];

        for (int i = 0; i < N.length(); i++) {
            arr[N.charAt(i) - '0']++;
        }

        if (arr[3] == 0 && arr[4] == 0 && arr[5] == 0 && arr[6] == 0 && arr[7] == 0 && arr[9] == 0) {
            if (arr[2] > 0 && arr[0] > 0 && arr[1] > 0 && arr[8] > 0) {
                if (arr[2] == arr[0] && arr[0] == arr[1] && arr[1] == arr[8]) {
                    System.out.println(8);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}