package boj;
import java.util.*;

public class BOJ16199 { // 나이 계산하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y1 = sc.nextInt();
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
       
        int year1 = 0; // 만 나이
        
        if (m1 < m2) {
        	year1 = y2 - y1;
        } else if (m1 == m2 && d1 <= d2) {
        	year1 = y2 - y1;
        } else {
        	year1 = y2 - y1 - 1;
        }
        
        int year2 = y2 - y1 + 1; // 세는 나이
        int year3 = y2 - y1; // 연 나이
    
        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);
		sc.close();
	}
}