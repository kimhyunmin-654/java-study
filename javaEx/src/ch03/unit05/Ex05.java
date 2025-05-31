package ch03.unit05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 - 하나의 문자를 입력 받아 입력 받은 문자가
		   대문자이면 소문자로 변환하여 출력하고
		   소문자이면 대문자로 변환하여 출력한다.
		   영문자가 아니면 입력 받은 문자 그대로 출력
		   참고로 대소문자의 차이는 32 이다.
		 - 출력 예
		   한문자 ? A
		   A -> a
		 */
		
		Scanner sc = new Scanner(System.in);
		char a, b;
		
		System.out.print("한문자 ? ");
		a = sc.next().charAt(0);
		
		b = a>='A' && a<='Z' ? (char)(a+32) :
			(a>='a' && a<='z' ? (char)(a-32) : a);
		
		System.out.println(a + " -> " + b);
		
		sc.close();

	}

}
