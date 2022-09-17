package boj;
import java.util.*;

public class BOJ20254 { // Site Score

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int UR = sc.nextInt(); // the number of universities solving at least one problem in the regional contest
        int TR = sc.nextInt(); // the number of teams solving at least one problem in the regional contest
        int UO = sc.nextInt(); // the number of universities solving at least one problem in TOPC
        int TO = sc.nextInt(); // the number of teams solving at least one problem in TOPC

        System.out.println(56 * UR + 24 * TR + 14 * UO + 6 * TO);
        sc.close();
    }
}