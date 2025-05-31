package ch04.unit03;

public class Ex20_dowhile {

	public static void main(String[] args) {
		
		
		/*
		int s, n;
		
		s = 0;
		n = 0;
		while(n < 10) {
			n++;
			s += n;
		}
		System.out.println(s);
		*/
		
		int s, n;
		s = 0;
		n = 0;
		do {
			n++;
			s+=n;
		} while(n < 10);
		System.out.println(s); // 55
		
	}

}
