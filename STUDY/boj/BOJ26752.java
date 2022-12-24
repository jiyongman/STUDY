package boj;
import java.util.*;

public class BOJ26752 { // Zegarek

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        S++;

        if (S >= 60) {
            S -= 60;
            M++;
        }

        if (M >= 60) {
            M -= 60;
            H++;
        }

        if (H >= 24) {
            H -= 24;
        }

        System.out.printf("%02d:%02d:%02d", H, M, S);
        sc.close();
    }
}