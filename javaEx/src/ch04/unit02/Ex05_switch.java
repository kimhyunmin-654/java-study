package ch04.unit02;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s;
		
		System.out.print("코드[a1, a2, a3] 입력 ? ");
		s = sc.next();
		
		// 문자열도 가능하다.
		switch(s) {
		case "a1": System.out.println("자바");break;
		case "a2": System.out.println("스프링");break;
		case "a3": System.out.println("오라클");break;
		default: System.out.println("입력 오류...");
		}
		
		sc.close();

	}

}
