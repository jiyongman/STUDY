package boj;
import java.util.*;

public class BOJ11365 { // !밀비 급일

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		while (true) {
			String str = sc.nextLine();
				
			if (str.equals("END")) {
				break;
			}
			StringBuffer sb = new StringBuffer(str);
			String reverse = sb.reverse().toString();

			System.out.println(reverse);
			
		}		

		sc.close();
	}	
}