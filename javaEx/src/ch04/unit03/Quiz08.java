package ch04.unit03;

public class Quiz08 {

	public static void main(String[] args) {
		// 1 + 2 + 4 + 7 + 11 + ... : 20개
		int n = 0;
		int s = 0;
		int t = 1;
		
		
		while(n < 20) {
			// System.out.println(t);
			s += t;
			
			n++;
			
			t += n;
			
		}
		System.out.println("결과 : " + s);
		

	}

}
