package boj;
import java.util.*;

public class BOJ18301 { // Rats

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // the number of captured rats on the first day
        int n2 = sc.nextInt(); // the number of captured rats on the second day
        int n12 = sc.nextInt(); // the number of captured rats on both days

        System.out.println((n1 + 1) * (n2 + 1) / (n12 + 1) - 1);
        sc.close();
    }
}