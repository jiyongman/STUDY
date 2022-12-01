package boj;
import java.util.*;

public class BOJ21355 { // Personnummer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.charAt(6) == '+') {
            if (Integer.parseInt(str.substring(0, 2)) >= 20) {
                System.out.print(18);
            } else {
                System.out.print(19);
            }
        } else {
            if (Integer.parseInt(str.substring(0, 2)) >= 20) {
                System.out.print(19);
            } else {
                System.out.print(20);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == 6) {
                continue;
            }

            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}