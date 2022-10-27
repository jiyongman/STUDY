package boj;
import java.util.*;

public class BOJ13288 { // A New Alphabet

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                System.out.print(arr[ch - 'a']);
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print(arr[ch - 'A']);
            } else {
                System.out.print(ch);
            }
        }

        sc.close();
    }
}