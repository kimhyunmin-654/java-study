package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		
		do {
			System.out.print("단 ? ");
			dan = sc.nextInt();
		}while(dan < 1 || dan > 9);
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		sc.close();

	}

}
