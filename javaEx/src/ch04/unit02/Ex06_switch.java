package ch04.unit02;

import java.util.Scanner;

/*
 - 강화된 switch 
 	: 여러조건
 	  case 값1,값2,값3 -> 문장(수식);
 	: 화살표 case 라벨(->)를 사용하면 마지막에 break를 사용한것과 동일
 	: 화살표 case 라벨(->)를 사용하면 실행문이 2줄이상이면 중괄호로 묶는다. 
 */

public class Ex06_switch {

	public static void main(String[] args) {
		//강화된 switch 표현 식
		Scanner sc = new Scanner(System.in);
		int y, m;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		// -> 끝에 break;가 있는 걸로 간주한다.
		// 화살표 case ->에서 2문장 이상을 경우에는 중괄호 {} 묶기
		switch(m) {
		case 1,3,5,7,8,10,12->System.out.println("31일 입니다.");
		case 4,6,9,11->System.out.println("30일 입니다.");
		case 2->{
			int d=y%4==0 && y%100!=0 || y%400==0 ? 29:28;
			System.out.println(d + "일 입니다.");
		}
		default->System.out.println("입력오류입니다.");
		}
		
		sc.close();

	}

}
