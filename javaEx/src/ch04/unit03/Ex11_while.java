package ch04.unit03;

public class Ex11_while {

	public static void main(String[] args) {
		// 1+(1+2) + (1+2+3) +(1+2+3...+9+10)
		
		int n, s, ss;
		n = s = ss = 0;
		
		while(n < 10) {
			n++;
			s += n;
			ss += s;
		}
		System.out.println("결과 : " + ss);

	}

}
