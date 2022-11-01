package boj;
import java.util.*;

public class BOJ16337 { // Die

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int result = 0;

        if (str.equals(":::") && str2.equals(":o:") && str3.equals(":::")) {
            result = 1;
        } else if ((str.equals("o::") && str2.equals(":::") && str3.equals("::o")) || str.equals("::o") && str2.equals(":::") && str3.equals("o::")) {
            result = 2;
        } else if ((str.equals("o::") && str2.equals(":o:") && str3.equals("::o")) || str.equals("::o") && str2.equals(":o:") && str3.equals("o::")) {
            result = 3;
        } else if (str.equals("o:o") && str2.equals(":::") && str3.equals("o:o")) {
            result = 4;
        } else if (str.equals("o:o") && str2.equals(":o:") && str3.equals("o:o")) {
            result = 5;
        } else if ((str.equals("ooo") && str2.equals(":::") && str3.equals("ooo")) || str.equals("o:o") && str2.equals("o:o") && str3.equals("o:o")) {
            result = 6;
        }

        if (result == 0) {
            System.out.println("unknown");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}