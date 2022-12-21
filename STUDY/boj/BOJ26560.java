package boj;
import java.util.*;

public class BOJ26560 { // Periods

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            System.out.print(str);

            if (str.charAt(str.length() - 1) != '.') {
                System.out.println(".");
            } else {
                System.out.println();
            }
        }

        sc.close();
    }
}