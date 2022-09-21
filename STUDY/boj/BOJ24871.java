package boj;
import java.util.*;

public class BOJ24871 { // Календарь на Альфе Центавра

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long d = sc.nextLong(); // days
        long m = sc.nextLong(); // months
        long w = sc.nextLong(); // weeks
        long i = sc.nextLong();
        long j = sc.nextLong();
        long k = sc.nextLong();
        char ch = (char) (((k - 1) * m * d + (j - 1) * d + i - 1) % w + 'a');

        System.out.println(ch);
        sc.close();
    }
}