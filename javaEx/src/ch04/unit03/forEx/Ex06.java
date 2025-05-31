package ch04.unit03.forEx;

public class Ex06 {

	public static void main(String[] args) {
		int s, n;
		// , 를 이용하여 여러 구문 나열
		for(n=1, s=0; n<=10; s+=n, n++);
		System.out.println("결과:" + s);
		
		// 잘못 작성한 예
		s = 0;
		for(n = 1; n <= 10; n++);
			s += n;
			System.out.println(n + ":" + s);

	}

}
