package boj;
import java.util.*;

public class BOJ9949 { // Hide those Letters

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            String str = sc.nextLine();

            if (str.charAt(0) == '#' && str.charAt(2) == '#') {
                break;
            }

            int n = Integer.parseInt(sc.nextLine()); // the number of lines of text making up the case

            System.out.printf("Case %d\n", i);

            for (int j = 0; j < n; j++) {
                char[] arr = sc.nextLine().toCharArray();

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == str.charAt(0) || arr[k] == str.charAt(0) - 32 || arr[k] == str.charAt(2) || arr[k] == str.charAt(2) - 32) {
                        arr[k] = '_';
                    }

                    System.out.print(arr[k]);
                }

                System.out.println();
            }

            System.out.println();
            i++;
        }

        sc.close();
    }
}