package boj;
import java.util.*;

public class BOJ7599 { // Library Codes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next(); // the name of the library
            int f = sc.nextInt(); // the width in mm of a single character in the font used by the library

            if (str.equals("#") && f == 0) {
                break;
            }

            int c = sc.nextInt(); // the number of books

            System.out.printf("%s Library\n", str);

            for (int i = 1; i <= c; i++) {
                int w = sc.nextInt(); // the width of the book in mm
                String str2 = sc.next();
                String str3 = "";

                if (w - 1 > f * str2.length()) {
                    str3 = "horizontal";
                } else {
                    str3 = "vertical";
                }

                System.out.printf("Book %d %s\n", i, str3);
            }
        }

        sc.close();
    }
}