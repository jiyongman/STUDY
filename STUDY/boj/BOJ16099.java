package boj;
import java.util.*;

public class BOJ16099 { // Larger Sport Facility

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            long lt = sc.nextLong(); // the length of the sports field of TelecomParisTech
            long wt = sc.nextLong(); // the width of the sports field of TelecomParisTech
            long le = sc.nextLong(); // the length of the sports field at Eurecom
            long we = sc.nextLong(); // the width of the sports field at Eurecom

            if (lt * wt > le * we) {
                System.out.println("TelecomParisTech");
            } else if (lt * wt < le * we) {
                System.out.println("Eurecom");
            } else {
                System.out.println("Tie");
            }
        }

        sc.close();
    }
}