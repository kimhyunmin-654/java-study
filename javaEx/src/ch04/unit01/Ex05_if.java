package ch04.unit01;

import java.util.Scanner;

public class Ex05_if {

	public static void main(String[] args) {
		// 세개의 정수르 입력 받아 적은수에서 큰수 순으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("세수 입력 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int t;
		if(a > b) {
			t = a; a = b; b = t;
		}
		if(a > c) {
			t = a; a = c; c = t;
		}
		if(b > c) {
			t = b; b = c; c = t;
		}
		System.out.println(a + ", " + b + ", " + c);
		
		sc.close();

	}

}
