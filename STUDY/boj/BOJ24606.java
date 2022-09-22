package boj;
import java.util.*;

public class BOJ24606 { // Double Password

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                cnt++;
            }
        }

        System.out.println((int) Math.pow(2, cnt));
        sc.close();
    }   
}