package boj;
import java.util.*;

public class BOJ9850 { // Cipher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            String str = "";

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 'A' && arr[j] <= 'Z') {
                    arr[j]--;

                    if (arr[j] < 'A') {
                        arr[j] += 26;
                    }
                }

                str += arr[j];
            }

            if (str.contains("CHIPMUNKS") && str.contains("LIVE")) {
                System.out.println(str);
                return;
            }
        }

        sc.close();
    }
}