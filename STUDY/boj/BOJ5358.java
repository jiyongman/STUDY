package boj;
import java.util.*;

public class BOJ5358 { // Football Team

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            char[] arr = sc.nextLine().toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'i') {
                    arr[i] = 'e';
                } else if (arr[i] == 'e') {
                    arr[i] = 'i';
                } else if (arr[i] == 'I') {
                    arr[i] = 'E';
                } else if (arr[i] == 'E') {
                    arr[i] = 'I';
                }

                System.out.print(arr[i]);
            }

            System.out.println();
        }

        sc.close();
    }
}