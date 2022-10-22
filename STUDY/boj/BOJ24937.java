package boj;
import java.util.*;

public class BOJ24937 { // SciComLove (2022)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "SciComLove";
        int tmp = N % str.length();

        System.out.println(str.substring(tmp) + str.substring(0, tmp));
        sc.close();
    }
}