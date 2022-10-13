package boj;
import java.util.*;

public class BOJ4613 { // Quicksum

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#")) {
                break;
            }

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    sum += (i + 1) * (str.charAt(i) - 'A' + 1);
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}