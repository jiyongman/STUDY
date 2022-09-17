package boj;
import java.util.*;

public class BOJ1076 { // 저항

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		ArrayList<String> str = new ArrayList<String>();
        str.add("black");
        str.add("brown");
        str.add("red");
        str.add("orange");
        str.add("yellow");
        str.add("green");
        str.add("blue");
        str.add("violet");
        str.add("grey");
        str.add("white");

        long result = 0L;
        result += str.indexOf(a) * 10;
        result += str.indexOf(b);
        result *= Math.pow(10, str.indexOf(c)); // 10의 거듭 제곱
        
        System.out.println(result);
		sc.close();
	}
}