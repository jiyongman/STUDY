package boj;
import java.util.*;

public class BOJ20360 { // Binary numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(str.length() - 1 - i);

            if (arr[i] == '1') {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}