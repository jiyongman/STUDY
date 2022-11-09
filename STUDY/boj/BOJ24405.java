package boj;
import java.util.*;

public class BOJ24405 { // Eye of Sauron

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.length() % 2 == 0 && str.charAt(str.length() / 2 - 1) == '(' && str.charAt(str.length() / 2) == ')') {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }

        sc.close();
    }
}