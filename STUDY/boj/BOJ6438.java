package boj;
import java.util.*;

public class BOJ6438 { // Reverse Text

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // the number of test cases

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();

            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }

        sc.close();
    }
}