package boj;
import java.util.*;

public class BOJ10491 { // Quite a problem

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine().toLowerCase();

            if (str.contains("problem")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}