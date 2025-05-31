package ch04.unit03;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, t;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// 입력 받은 두수중 적은수는 a, 큰수는 b에 저장
		if (a > b) {
			t = a; a = b; b = t;
		}
		
		// 적은수에서 큰수까지 합구하기
		int n,s;
		n = a;
		s = 0;
		while(n <= b) {
			s += n;
			n++;			
		}
		System.out.println(a + "~" + b + " 까지 합 : " + s);
		
		sc.close();
	}

}
