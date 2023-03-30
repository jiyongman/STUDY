package boj;
import java.util.*;

public class BOJ27891 { // 특별한 학교 이름 암호화

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String school = sc.next();

        if (school.charAt(0) == school.charAt(7)) {
            System.out.println("NLCS");
        } else if (school.charAt(2) == school.charAt(9)) {
            System.out.println("KIS");
        } else if (school.charAt(0) == school.charAt(6)) {
            System.out.println("SJA");
        } else {
            System.out.println("BHA");
        }

        sc.close();
    }
}