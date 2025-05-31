package ch03.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 두수 입력 받아 사직연산 하기
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\t", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\t", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		
		
		sc.close();

	}

}
