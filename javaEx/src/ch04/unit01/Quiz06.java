package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char op;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		op = sc.next().charAt(0);
		
		if(op == '+') {
			System.out.printf("%d + %d = %d", a, b, a + b);
		} else if (op == '-') {
			System.out.printf("%d - %d = %d", a, b, a - b);
		} else if (op == '*') {
			System.out.printf("%d * %d = %d", a, b, a * b);
		} else if (op == '/') {
			System.out.printf("%d / %d = %d", a, b, a / b);
		} else {
			System.out.println("연산자 입력 에러 입니다.");
		}
		
		sc.close();

	}

}
