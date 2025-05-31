package ch04.unit03.forEx;

public class Quiz09 {

	public static void main(String[] args) {
		
		/*
		int s = 0;
		for(int i = 1; i<=100; i++) {
			s += i;
			if(i % 10 == 0) {
				System.out.println("1~" + i + "까지 합 : " + s);
			}
		}
		*/
		
		int s = 0;
		for(int i = 1; i<=100; i++) {
			s += i;
			if(i % 10 == 0) {
				System.out.println((i-9) + " ~ " + i + "까지 합 : " + s);
				s=0;
			}
		}

	}

}
