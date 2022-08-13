package boj;
import java.util.*;

public class BOJ2975 { // Transactions
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt(); // the starting balance
			String str = sc.next(); // the letter W or the letter D(Withdrawal or Deposit)
			int b = sc.nextInt(); // the amount to be withdrawn or deposited
			
			if (a == 0 && str.equals("W") && b == 0) {
				break;
			}
			
			if (a - b < -200 && str.equals("W")) {
				System.out.println("Not allowed");
			} else if (str.equals("W")) {
				System.out.println(a - b);
			} else if (str.equals("D")) {
				System.out.println(a + b);
			}
		}
		
		sc.close();
	}
}