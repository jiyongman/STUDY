package boj;
import java.util.*;

public class BOJ6917 { // AmeriCanadian

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("quit!")) {
                break;
            }

            char ch = str.charAt(str.length() - 3);

            if (str.length() >= 4 && (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y') && str.substring(str.length() - 2).equals("or")) {
                System.out.print(str.substring(0, str.length() - 1));
                System.out.println("ur");
            } else {
                System.out.println(str);
            }
        }

        sc.close();
    }
}