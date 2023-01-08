package boj;
import java.util.*;

public class BOJ15406 { // Check the Check

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String dish = sc.nextLine(); // the name of the ordered dish

            if (dish.equals("TOTAL")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int price = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            sum += price * number;
        }

        int total = sc.nextInt();

        if (total <= sum) {
            System.out.println("PAY");
        } else {
            System.out.println("PROTEST");
        }

        sc.close();
    }
}