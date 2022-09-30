package boj;
import java.util.*;

public class BOJ1440 { // 타임머신

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 시간
        String[] arr = str.split(":");
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i) {
                        if ((Integer.parseInt(arr[i]) >= 1 && Integer.parseInt(arr[i]) <= 12)
                            && (Integer.parseInt(arr[j]) >= 0 && Integer.parseInt(arr[j]) <= 59)
                            && (Integer.parseInt(arr[k]) >= 0 && Integer.parseInt(arr[k]) <= 59)) {
                                cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}