package ch04.unit01;

import java.util.Scanner;

public class Ex02_if {

	public static void main(String[] args) {
		// 정수를 입력 받아 홀수인지 판결
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		if(n%2 == 1) {
			System.out.println(n + "은 홀수 입니다.");
		}
		
		/*
		 if((n&1) == 1) {
		 	System.out.println(n + "은 홀수 입니다.");
		 }
		 */
		
		sc.close();

	}

}
