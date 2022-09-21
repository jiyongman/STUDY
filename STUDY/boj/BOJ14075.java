package boj;
import java.util.*;

public class BOJ14075 { // Luhn

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[16];

        for (int i = 0; i < 16; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < 16; i += 2) {
            arr[i] *= 2;

            if (arr[i] >= 10) {
                arr[i] = arr[i] % 10 + 1;
            }
        }

        int result = 0;

        for (int i = 0; i < 16; i++) {
            result += arr[i];
        }

        if (result % 10 == 0) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }

        sc.close();
    }   
}