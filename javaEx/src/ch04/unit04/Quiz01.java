package ch04.unit04;

import java.util.Scanner;

/*
  1. 합 2. 짝수합 3. 홀수합 4. 종료 => 1
  수 ? 10
  1~10까지 합 : 55
  
  1. 합 2. 짝수합 3. 홀수합 4. 종료 => 2
  수 ? 10
  1~10까지 합 : 30
  
  1. 합 2. 짝수합 3. 홀수합 4. 종료 => 4
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, input;
		int s;

		while (true) {
			do {
				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
				ch = sc.nextInt();
			} while (ch >= 1 || ch <= 4);

			if (ch == 4) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.print("수 입력 ? ");
			input = sc.nextInt();

			s = 0;
			if (ch == 1) {
				for (int n = 1; n <= input; n++) {
					s += n;
				}
				System.out.println("1. 합 : " + s);
			} else if (ch == 2) {
				for (int n = 2; n <= input; n += 2) {
					s += n;
				}
				System.out.println("2. 짝수합 : " + s);
			} else {
				for (int n = 1; n <= input; n += 2) {
					s += n;
				}
				System.out.println("3. 홀수합 : " + s);
			}
		}
		sc.close();

	}

}
