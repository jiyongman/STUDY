package boj;
import java.util.*;

public class BOJ6763 { // Speed fines are not fine!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // speed limit
        int b = sc.nextInt(); // the recorded speed of the car

        if (b - a <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (b - a <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (b - a <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else {
            System.out.println("You are speeding and your fine is $500.");
        }

        sc.close();
    }
}