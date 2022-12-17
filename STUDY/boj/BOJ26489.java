package boj;
import java.util.*;

public class BOJ26489 { // Gum Gum for Jay Jay

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if (str.equals("gum gum for jay jay")) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}