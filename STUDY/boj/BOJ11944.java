package boj;
import java.util.*;

public class BOJ11944 { // NN

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String str = "";

        for (int i = 0; i < N; i++) {
            str += N;

            if (str.length() > M) {
                str = str.substring(0, M);
                break;
            }
        }

        System.out.println(str);
        sc.close();
    }
}