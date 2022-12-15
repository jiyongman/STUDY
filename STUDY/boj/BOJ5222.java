package boj;
import java.util.*;

public class BOJ5222 { // Vigenère Cipher

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // the number of test cases

        for (int i = 0; i < t; i++) {
            String str = sc.next(); // the keyword
            char[] arr = sc.next().toCharArray(); // the plaintext

            System.out.print("Ciphertext: ");

            for (int j = 0; j < arr.length; j++) {
                arr[j] += str.charAt(j % str.length()) - 'A';

                if (arr[j] > 'Z') {
                    arr[j] -= 26;
                }

                System.out.print(arr[j]);
            }

            System.out.println();
        }

        sc.close();
    }
}