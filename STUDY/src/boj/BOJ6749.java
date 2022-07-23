package boj;
import java.util.*;

public class BOJ6749 { // Next in line

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt(); // the age Y of the youngest child
        int M = sc.nextInt(); // the age M of the middle child
        int O = M + M - Y; // the age O of the oldest child

        System.out.println(O);
        sc.close();
    }
}