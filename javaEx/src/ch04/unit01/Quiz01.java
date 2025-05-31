package ch04.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		
		System.out.print("첫번째 수 ? ");
		n1 = sc.nextInt();
		System.out.print("첫번째 수 ? ");
		n2 = sc.nextInt();
		
		//풀이1
		/*
		 result = n1 - n2;
		if(result < 0) {
			result = -result;
		}
		System.out.println("두수의 차이 : " + result);
		 */
		
		//풀이2
		if(n1 > n2) {
			result = n1 - n2;
		} else {
			result = n2 - n1;
		}
		System.out.println("두수의 차이 : " + result);
		
		sc.close();
	}

}
