package ch03.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("섭씨 온도 ? ");
		n = sc.nextInt();
		
		double haw = n * 1.8 + 32;
		
		System.out.printf("화씨온도 : %.1f", haw);
		
		sc.close();

	}

}
