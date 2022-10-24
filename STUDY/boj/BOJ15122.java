package boj;
import java.util.*;

public class BOJ15122 { // Forbidden Zero

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        while (true) {
            int tmp = Integer.parseInt(n) + 1;
            n = String.valueOf(tmp);

            if (n.contains("0")) {
                continue;
            } else {
                break;
            }
        }

        System.out.println(n);
        sc.close();
    }
}