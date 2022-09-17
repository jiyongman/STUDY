package boj;
import java.util.*;

public class BOJ10828 { // 스택
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt(); // 명령의 수
		stack = new int[N];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			
			switch (str) {
			case "push":
				push(sc.nextInt());
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
	
	public static void push(int X) { // 정수 X를 스택에 넣는 연산
		stack[size] = X;
		size++;
	}
	
	public static int pop() { // 스택에서 가장 위에 있는 정수를 빼고 그 수를 출력, 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
		if (size == 0) {
			return -1;
		} else {
			int result = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return result;
		}
	}
	
	public static int size() { // 스택에 들어있는 정수의 개수를 출력
		return size;
	}
	
	public static int empty() { // 스택이 비어있으면 1, 아니면 0을 출력
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() { // 스택의 가장 위에 있는 정수를 출력, 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}