package boj;
import java.util.*;

public class BOJ16675 { // 두 개의 손

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char m1 = sc.next().charAt(0);
        char m2 = sc.next().charAt(0);
        char t1 = sc.next().charAt(0);
        char t2 = sc.next().charAt(0);

        if ((win(m1, t1) && win(m1, t2)) || (win(m2, t1) && win(m2, t2))) {
            System.out.println("MS");
        } else if ((win(t1, m1) && win(t1, m2)) || (win(t2, m1) && win(t2, m2))) {
            System.out.println("TK");
        } else {
            System.out.println("?");
        }

        sc.close();
    }

    public static boolean win(char a, char b) {

        if ((a == 'S' && b == 'P') || (a == 'R' && b == 'S') || (a == 'P' && b == 'R')) {
            return true;
        } else {
            return false;
        }
    }
}