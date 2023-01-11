package boj;
import java.util.*;

public class BOJ1427 { // 소트인사이드

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - '0' < arr[j] - '0') {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}