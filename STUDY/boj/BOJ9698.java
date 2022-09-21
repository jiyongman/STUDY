package boj;
import java.util.*;

public class BOJ9698 { // SAHUR & IMSA’

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int H = sc.nextInt(); // hours
            int M = sc.nextInt(); // minutes

            if (M < 45) {
                M += 15;
                if (H == 0) {
                    H += 23;
                } else {
                    H--;
                }
            } else {
                M -= 45;
            }

            System.out.println("Case #" + x + ": " + H + " " + M);
        }

        sc.close();
    }   
}