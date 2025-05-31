package ch03.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 초를 입력 받아 시분초 구하기
		Scanner sc = new Scanner(System.in);
		int seconds;
		
		System.out.print("초를 입력하세요 > ");
		seconds = sc.nextInt();
		
		int h, m ,s;
		
		h = seconds / 3600;
		m = (seconds / 60) % 60;
		s = seconds % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", seconds, h, m, s);
		
		
		sc.close();

	}

}
