package boj;
import java.util.*;

public class BOJ4500 { // “Bubble Gum, Bubble Gum, in the dish, how many pieces do you wish?”

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // the number of test cases

        for (int i = 0; i < t; i++) {
            String[] arr = sc.nextLine().split(" "); // the names of the people
            String str = sc.nextLine(); // the name of the person choosing the number of pieces of bubble gum
            int n = Integer.parseInt(sc.nextLine()); // the number of pieces of gum
            int tmp = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(str)) {
                    tmp = (j - 1) + n;
                }
            }

            System.out.println(arr[tmp % arr.length]);
        }

        sc.close();
    }
}