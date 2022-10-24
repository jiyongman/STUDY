package boj;
import java.util.*;

public class BOJ6500 { // 랜덤 숫자 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int[] arr = new int[10000];
            arr[a]++;

            if (a == 0) {
                break;
            }

            while (arr[a] <= 1) {
                String str = String.valueOf(a * a);
                String str2 = "";

                if (str.length() < 8) {
                    for (int i = 0; i < 8 - str.length(); i++) {
                        str2 += "0";
                    }
                    str2 += str;
                    str = str2;
                }

                a = Integer.parseInt(str.substring(2, 6));
                arr[a]++;
            }

            int cnt = 0;

            for (int i = 0; i < 10000; i++) {
                if (arr[i] > 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}