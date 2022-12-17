package boj;
import java.util.*;

public class BOJ5342 { // Billing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = {"Paper", "Printer", "Planners", "Binders", "Calendar", "Notebooks", "Ink"};
        double[] arr2 = {57.99, 120.50, 31.25, 22.50, 10.95, 11.20, 66.95};
        double sum = 0;

        while (true) {
            String str = sc.next();

            if (str.equals("EOI")) {
                break;
            }

            for (int i = 0; i < arr.length; i++) {
                if (str.equals(arr[i])) {
                    sum += arr2[i];
                }
            }
        }

        System.out.printf("$%.02f", sum);
        sc.close();
    }
}