package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		int odd, even;

		odd = even = 0;

		System.out.println("10개의 정수를 입력 하세요...");

		for (int i = 1; i <= 10; i++) {
			input = sc.nextInt();

			if (input % 2 == 0) {
				even++;

			} else {
				odd++;
			}
		}
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);

		sc.close();

	}

}
