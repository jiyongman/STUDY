package boj;
import java.util.*;

public class BOJ11608 { // Complexity

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        Arrays.sort(arr);
        int result = str.length() - (arr[24] + arr[25]);

        System.out.println(result);
        sc.close();
    }
}