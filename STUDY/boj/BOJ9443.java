package boj;
import java.util.*;

public class BOJ9443 { // Arrangement of Contest

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of problem proposals received by the little brothers
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            arr[i] = str.charAt(0);
        }

        Arrays.sort(arr);
        char ch = 'A';
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == ch) {
                cnt++;
                ch++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}