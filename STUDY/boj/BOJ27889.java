package boj;
import java.util.*;

public class BOJ27889 { // 특별한 학교 이름

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String school = sc.next();

        if (school.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        } else if (school.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (school.equals("KIS")) {
            System.out.println("Korea International School");
        } else {
            System.out.println("St. Johnsbury Academy");
        }

        sc.close();
    }
}