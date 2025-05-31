package ch05.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] tti = { "원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "범", "말", "양" };

		int y;

		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		} while (y < 1900);

		String s = tti[y % 12]; // 2028 / 12 

		System.out.printf("%d년도는 %s띠 의 해입니다.", y, s);

		sc.close();

	}

}
