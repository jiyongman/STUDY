package boj;
import java.util.*;

public class BOJ5218 { // 알파벳 거리

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            String str2 = sc.next();
            int[] arr = new int[str.length()];

            System.out.print("Distances:");

            for (int j = 0; j < str.length(); j++) {
                if (str2.charAt(j) - str.charAt(j) >= 0) {
                    arr[j] = str2.charAt(j) - str.charAt(j);
                } else {
                    arr[j] = str2.charAt(j) - str.charAt(j) + 26;
                }

                System.out.print(" " + arr[j]);
            }

            System.out.println();
        }

        sc.close();
    }
}