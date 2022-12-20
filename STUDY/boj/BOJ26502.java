package boj;
import java.util.*;

public class BOJ26502 { // Decoder

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 'a') {
                    System.out.print('e');
                } else if (ch == 'e') {
                    System.out.print('i');
                } else if (ch == 'i') {
                    System.out.print('o');
                } else if (ch == 'o') {
                    System.out.print('u');
                } else if (ch == 'u') {
                    System.out.print('y');
                } else if (ch == 'y') {
                    System.out.print('a');
                } else if (ch == 'A') {
                    System.out.print('E');
                } else if (ch == 'E') {
                    System.out.print('I');
                } else if (ch == 'I') {
                    System.out.print('O');
                } else if (ch == 'O') {
                    System.out.print('U');
                } else if (ch == 'U') {
                    System.out.print('Y');
                } else if (ch == 'Y') {
                    System.out.print('A');
                } else {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}