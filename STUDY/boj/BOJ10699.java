package boj;
import java.text.SimpleDateFormat;
import java.util.*;

public class BOJ10699 { // 오늘 날짜

	public static void main(String[] args) {
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		f.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println(f.format(d));
	}
}