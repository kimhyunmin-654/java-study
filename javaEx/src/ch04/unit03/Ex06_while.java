package ch04.unit03;

public class Ex06_while {

	public static void main(String[] args) {
		// 1~100까지 짝수의 합
		/*
		int s, n;
		s = 0;
		n = 0;
		while(n < 100) {
			n += 2;
			s += n; // 2+4+6+ ... 98 +100
		}
		System.out.println("결과 : " + s);
		*/
		
		// 1~100 까지 홀수합
		/*
		int s, n;
		s = 0;
		n = 0;
		while(n < 100) { // 속도가 느림
			n++;
			if(n%2==1) {
				s += n;
			}
			
		}
		System.out.println("결과 : " + s);
 		*/
		
		// 1+3+5 ... 97+99
		int n, s;
		n = 1;
		s = 0;
		while(n < 100) {
			s+=n;
			n+=2;
		}
		System.out.println("결과 : " + s);
		
	}

}
