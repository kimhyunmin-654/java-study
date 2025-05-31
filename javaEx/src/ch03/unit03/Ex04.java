package ch03.unit03;

public class Ex04 {

	public static void main(String[] args) {
		int a = 17, b = 20;
		int c, d;
		
		//  짝수 홀수를 판별할 수 있음
		c = a & 1; // 1
		d = b & 1; // 0
		System.out.println(c + ", " + d);

	}

}
