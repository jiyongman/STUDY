package boj;
import java.util.*;

public class BOJ6812 { // Good times

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int O = sc.nextInt();
        int V = O - 300;
        int E = O - 200;
        int W = O - 100;
        int T = O;
        int H = O + 100;
        int J = O + 130;

        if (V < 0) {
            V += 2400;
        }
        if (E < 0) {
            E += 2400;
        }
        if (W < 0) {
            W += 2400;
        }
        if (H >= 2400) {
            H -= 2400;
        }
        if (J % 100 >= 60) {
            J -= 60;
            J += 100;
        }
        if (J >= 2400) {
            J -= 2400;
        }

        System.out.println(O + " in Ottawa");
        System.out.println(V + " in Victoria");
        System.out.println(E + " in Edmonton");
        System.out.println(W + " in Winnipeg");
        System.out.println(T + " in Toronto");
        System.out.println(H + " in Halifax");
        System.out.println(J + " in St. John's");

        sc.close();
    }
}