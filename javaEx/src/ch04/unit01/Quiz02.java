package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.print("년도 ? ");
		n = sc.nextInt();
		
		//풀이1
		/*
		if(n%4==0 && n%100!=0 || n%400==0) {
			System.out.println(n + "년도는 윤년입니다.");
		} else {
			System.out.println(n + "년도는 윤년이 아닙니다.");
		}
		*/
		
		//풀이2
		if(n%4==0 && n%100!=0 || n%400==0) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		System.out.printf("%d년도는 %s입니다.\n", n, s);
		
		
		sc.close();

	}

}
