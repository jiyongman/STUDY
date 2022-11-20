package boj;
import java.util.*;

public class BOJ25985 { // Fastestest Function

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); // the percentage of the total running time that foo took before optimising
        double y = sc.nextDouble(); // the percentage of the total running time it took after optimising
        double result = x * (100 - y) / ((100 - x) * y);

        System.out.println(result);
        sc.close();
    }
}