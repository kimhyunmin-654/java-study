package ch04.unit01;

import java.util.Scanner;

public class Ex07_if {

	public static void main(String[] args) {
		// 정수를 입력 받아 3 또는 4의 배수인지 판별
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n = sc.nextInt();
		
		// 잘못 작성한 예
		/*
		if(n%3==0 ) {
			System.out.println(n + "->3의배수");
		} else if(n%4 ==0) {
			System.out.println(n + "->4의배수");
		} else if(n%3==0&&n%4==0) {
			System.out.println(n + "-> 3과 4의배수");
		} else {
			System.out.println(n + "->3 또는 4의 배수가 아님");
		}
		*/
		
		if(n%3==0&&n%4==0) {
			System.out.println(n + "-> 3과 4의배수");
		} else if(n%3 ==0) {
			System.out.println(n + "->3의배수");
		} else if(n%4 ==0) {
			System.out.println(n + "->4의배수");
		} else {
			System.out.println(n + "->3 또는 4의 배수가 아님");
		}
		
		sc.close();

	}

}
