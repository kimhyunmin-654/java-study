package ch04.unit03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int input;
		System.out.print("수 ? ");
		input = sc.nextInt();
		
		int n;
		int s, o, e;
		n = 0;
		s = o = e = 0;
		while(n < input) {
			n++;
			s+=n;
			if(n%2==0) {
				e+=n; // 짝수합
			} else {
				o += n; // 홀수합
			}
						
		}
		System.out.println("1~100 까지 합 = " + s);
		System.out.println("1~100 까지 짝수 합 = " + e);
		System.out.println("1~100 까지 홀수 합 = " + o);
		
		sc.close();

	}
}
