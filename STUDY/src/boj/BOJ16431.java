package boj;
import java.util.*;

public class BOJ16431 { // 베시와 데이지
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Br = sc.nextInt(); // 베시의 행 좌표
		int Bc = sc.nextInt(); // 베시의 열 좌표
		int Dr = sc.nextInt(); // 데이지의 행 좌표
		int Dc = sc.nextInt(); // 데이지의 열 좌표
		int Jr = sc.nextInt(); // 존의 행 좌표
		int Jc = sc.nextInt(); // 존의 열 좌표
		int sec = Math.max(Math.abs(Jr - Br), Math.abs(Jc - Bc)); // 베시가 존에게 가는 데 걸리는 시간(초) 
		int sec2 = Math.abs(Jr - Dr) + Math.abs(Jc - Dc); // 데이지가 존에게 가는 데 걸리는 시간(초)
		
		if (sec < sec2) {
			System.out.println("bessie");
		} else if (sec > sec2) {
			System.out.println("daisy");
		} else {
			System.out.println("tie");
		}
		
		sc.close();
	}
}