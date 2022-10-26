package boj;
import java.util.*;

public class BOJ18415 { // キャピタリゼーション (Capitalization)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        str = str.replaceAll("joi", "JOI");

        System.out.println(str);
        sc.close();
    }
}