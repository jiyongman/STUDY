package boj;
import java.util.*;

public class BOJ25828 { // Corona Virus Testing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(); // the number of groups
        int p = sc.nextInt(); // the number of people in each group
        int t = sc.nextInt(); // how many groups tested positive

        if (g * p < p * t + g) {
            System.out.println(1);
        } else if (g * p > p * t + g) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}