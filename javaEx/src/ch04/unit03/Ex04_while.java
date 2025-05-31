package ch04.unit03;

public class Ex04_while {

	public static void main(String[] args) {
		// A ~ z 까지 출력
		
		/*
		char c = 64;
		while( c++ < 'Z') {
			System.out.print(c + "  ");
		}
		System.out.println();
		*/
		
		/*
		char c = 65; // 'A'도 가능
		while( c <= 'Z') {
			System.out.print(c + "  ");
			c++;
		}
		System.out.println();
		*/
		
		// 한줄에 7개씩 출력
		
		/*
		char c = 'A';
		int n = 0;
		while( c <= 'Z') {
			System.out.print(c + "  ");
			n++;
			if(n % 7 == 0) {
				System.out.println();
			}
			c++;
		}
		System.out.println();
		*/
		
		/*
		char c = 'A';
		int n = 0;
		while( c <= 'Z') {
			n++;
			System.out.print(c + (n%7==0?"\n":"  "));
			c++;
		}
		System.out.println();
		*/
		
		/*
		char c = A;
		while( c <= 'Z') {
			System.out.print(c + ((c-64)%7==0?"\n":"  "));
			c++;
		}
		System.out.println();
		*/
		
		char c = 'A';
		int n = 0;
		while ( c <= 'Z') {
			System.out.print(c + "  ");
			n++;
			if (n == 7) {
				n = 0;
				System.out.println();
			}
			c++;
		}
		System.out.println();

	}

}
