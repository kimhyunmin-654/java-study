package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		int s;
				
		do {
			System.out.print("수 ? ");
			input = sc.nextInt();
		} while(input < 1 || input > 1000);
		
		s = 0;
		for(int n = 1; n <= input; n++) {
			s += n;
			
		}
		System.out.printf("1~%d까지 합 : %d", input, s);
		
		sc.close();

	}

}
