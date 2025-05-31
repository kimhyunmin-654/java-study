package ch03.unit07;

public class Ex01 {

	public static void main(String[] args) {
		int a = 5, b = 2;
		
		double c = a / b; // 연산결과가 자동으로 double로 형변환
		System.out.println(c); // 2
		
		c = (double)a / b; // 강제 형변환
		System.out.println(c); // 2.5
		
		byte x = 10;
		short y = 20;
		
		// x = 20; // 가능
		// x = y; // 컴오류
		x = (byte)y;
		System.out.println(x);
		
		y = 200;
		x = (byte)y; // 강제 형변환은 가능하지만 overflow가 발생
		System.out.println(x); // -56

	}

}
