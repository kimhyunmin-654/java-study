package ch09.unit03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, tel;
		int age;
		
		try {
			System.out.print("이름 ? ");
			name = sc.nextLine();
				// 중간에 공백도 입력 가능. 엔터까지 읽어서 엔터 버림
			System.out.print("나이 ? ");
			age = sc.nextInt();
				// 엔터전까지만 읽음
			sc.nextLine();
				// 엔터를 읽어서 버림
			System.out.print("전화 ? ");
			tel = sc.nextLine();
							
			System.out.println(name + ":" + age + ":" + tel);
			
			// catch 블럭없는 finally 블럭
		} finally {
			System.out.println("예외 발생 유무와 상관 없이 실행..");
		}
		
		// 나이를 문자열에 입력하면 end.. 은 출력 되지 않고 비 정상 종료
		System.out.println("end...");

	}

}
