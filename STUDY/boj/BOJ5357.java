package boj;
import java.util.*;

public class BOJ5357 { // Dedupe

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println(str.charAt(str.length() - 1));
        }

        sc.close();
    }
}