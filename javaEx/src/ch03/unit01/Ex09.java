package ch03.unit01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 반지름을 입력 받아 원의 넓이 둘레 계산
		// 넓이 = 반*반*3.14
		// 둘레 = 반*2*3.14
		Scanner sc = new Scanner(System.in);
		int r;
		double a, b;
		
		System.out.print("반지름 ? ");
		r = sc.nextInt();
		
		// a = r * r * 3.141592; // 반지름이 50000 이면 음수
		// a = (double)r * r * 3.141592;
		a = 3.141592 * r * r;
		b = 3.141592 * r * 2;
		
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		
		sc.close();
	}

}
