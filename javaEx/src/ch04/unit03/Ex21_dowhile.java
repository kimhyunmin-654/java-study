package ch04.unit03;

import java.util.Scanner;

public class Ex21_dowhile {

	public static void main(String[] args) {
		// 1~9 사이의 단을 입력 받아 구구단 출력
		// 단, 입력 받은 단이 1~9 사이의 수가 아니면 다시 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		/*
		System.out.print("단 ? ");
		dan = sc.nextInt();
		
		
		int n = 1;
		do {	
			if(dan > 10) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				System.out.println(dan + " * " + n + " = " + (dan*n));
				n++;
				break;
			}			
		} while(n <= 9);
		*/
		
		do {
			System.out.print("단 ? ");
			dan = sc.nextInt();
		} while (dan < 1 || dan > 9);
		
		int n = 0;
		while(n < 9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan*n);
		}		
		
		sc.close();

	}

}
