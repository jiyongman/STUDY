package boj;
import java.util.*;

public class BOJ4740 { // 거울, 오! 거울
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			
			if (str.equals("***")) {
				break;
			}
			
			for (int i = str.length() - 1; i >= 0; i--) {
				char ch = str.charAt(i);
				
				System.out.print(ch);
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}