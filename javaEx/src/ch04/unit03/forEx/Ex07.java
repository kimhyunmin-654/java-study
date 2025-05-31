package ch04.unit03.forEx;

public class Ex07 {

	public static void main(String[] args) {
		// 1~100 까지 홀수합
		int s = 0;
		for(int n = 1; n <= 100; n+=2) { // n의 유호범위는 for문
			s += n;
		}
		System.out.println("홀수 합 : " + s);
		
		// 1~100 까지 합
		// int s = 0; // 컴오류
		s = 0;
		for(int n = 2; n <= 100; n+=2) {
			s += n;
		}
		System.out.println("짝수 합 : " + s);

	}

}
