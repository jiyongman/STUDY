package boj;
import java.util.*;

public class BOJ20216 { // Ducky Debugging

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("I quacked the code!")) {
                break;
            }

            char ch = str.charAt(str.length() - 1);

            if (ch == '?') {
                System.out.println("Quack!");
            } else {
                System.out.println("*Nod*");
            }

            System.out.flush();
        }

        sc.close();
    }
}