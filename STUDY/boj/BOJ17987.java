package boj;
import java.util.*;

public class BOJ17987 { // Howl

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("AWHO");

        while (str.length() >= sb.length()) {
            sb.append("O");
        }

        System.out.println(sb);
        sc.close();
    }
}