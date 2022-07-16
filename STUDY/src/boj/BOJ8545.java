package boj;
import java.util.*;

public class BOJ8545 { // Zadanie próbne

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str); // reverse() 메소드 사용 가능
        String reverse = sb.reverse().toString();

        System.out.println(reverse);
        sc.close();
    }
}