package boj;
import java.util.*;

public class BOJ20733 { // Triple Texting

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.substring(0, s.length() / 3);
        String str2 = s.substring(s.length() / 3, s.length() - (s.length() / 3));
        String str3 = s.substring(s.length() - (s.length() / 3));

        if (str.equals(str2) || str.equals(str3)) {
            System.out.println(str);
        } else if (str2.equals(str3)) {
            System.out.println(str2);
        }

        sc.close();
    }
}