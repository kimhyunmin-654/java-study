package ch04.unit01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, result;
		int k, e, m;
		int tot, ave;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		k = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();
		
		tot = k + e + m;
		ave = tot / 3;
		
		if(k>=40 && e>=40 && m>=40 && ave>=60) {
			result = "합격";
		} else if(ave<60) {
			result = "불합격";
		} else {
			result = "과락";
		}
		
		System.out.printf("%s님은 %s 입니다.\n", name, result);
		
		sc.close();
		 

	}

}
