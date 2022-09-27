package boj;
import java.util.*;

public class BOJ15272 { // Hissing Microphone

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        int cnt = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == 's' && arr[i + 1] == 's') {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }

        sc.close();
    }
}