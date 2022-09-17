package boj;
import java.util.*;

public class BOJ1032 { // 명령 프롬프트
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		boolean bl = true;
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}	
		
		for (int i = 0; i < str[0].length(); i++) {
				bl = true;
				for (int j = 0; j < N - 1; j++) {
					if (str[j].charAt(i) != str[j + 1].charAt(i)) {
						bl = false;
						break;
					}
				}
				
				if (bl == true) {
					System.out.print(str[0].charAt(i));
				} else {
					System.out.print("?");
				}
			}
		
		sc.close();
		}
}