package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 ? ");
		int n = sc.nextInt();
		
		
		
		System.out.println("오만원권 : " + (n/50000));
		System.out.println("만원권 : " + ((n%50000)/10000));
		System.out.println("오천원권 : " + ((n%10000)/5000));
		System.out.println("천원권 : " + ((n%5000)/1000));
		System.out.println("오백원권 : " + ((n%1000)/500));
		System.out.println("백원권 : " + ((n%500)/100));
		System.out.println("오십원권 : " + ((n%100)/50));
		System.out.println("십원권 : " + ((n%50)/10));
		System.out.println("오원권 : " + ((n%10)/5));
		System.out.println("일원권 : " + (n%5));
		
		
		sc.close();
		
		
		
	}

}
