package boj;
import java.util.*;

public class BOJ13234 { // George Boole

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean value1 = sc.nextBoolean();
        String operation = sc.next();
        boolean value2 = sc.nextBoolean();

        if (operation.equals("AND")) {
            System.out.println(value1 && value2);
        } else {
            System.out.println(value1 || value2);
        }

        sc.close();
    }
}