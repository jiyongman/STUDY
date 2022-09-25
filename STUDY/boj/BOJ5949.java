package boj;
import java.util.*;

public class BOJ5949 { // Adding Commas

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if ((str.length() - i) % 3 == 0 && i != 0) {
                System.out.print(",");
            }

            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}