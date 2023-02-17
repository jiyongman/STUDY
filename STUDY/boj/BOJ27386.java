package boj;
import java.util.*;

public class BOJ27386 { // Class Field Trip

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ann = sc.next();
        String ben = sc.next();
        char[] merged = new char[ann.length() + ben.length()];

        for (int i = 0; i < ann.length(); i++) {
            merged[i] = ann.charAt(i);
        }

        for (int i = 0; i < ben.length(); i++) {
            merged[ann.length() + i] = ben.charAt(i);
        }

        Arrays.sort(merged);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
        }

        sc.close();
    }
}