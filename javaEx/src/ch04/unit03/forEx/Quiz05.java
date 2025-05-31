package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// 가장 처음 입력 받은 수를 초기값으로 할당
		int input;
		int max;
		
		System.out.println("10개의 정수를 입력 하세요...");
		max = sc.nextInt();
		for(int i = 1; i<10; i++) {
			input = sc.nextInt();
			
			if(max < input) {
				max = input;
			}
		}
		System.out.println("최대값 : " + max);
		*/
		
		
		// 가장 처음 입력 받은 수를 초기값으로 할당
		/*
		int input;
		int max=0;
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i = 1; i<=10; i++) {
			input = sc.nextInt();
			
			if(i==1 || max < input) { // i==1 은 처음 입력 받은 경우
				max = input;
			}
		}
		System.out.println("최대값 : " + max);
		*/
		
		// 가장 적은수를 초기값으로 할당
		int input;
		int max=0x80000000; // 정수중 가장 적은수
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i = 1; i<=10; i++) {
			input = sc.nextInt();
			
			if(max < input) { // i==1 은 처음 입력 받은 경우
				max = input;
			}
		}
		System.out.println("최대값 : " + max);
		
		
		
		sc.close();
		
	}

}
