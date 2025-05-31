package ch04.unit03.forEx;

public class Ex10 {

	public static void main(String[] args) {
		// for 문에서는 float을 증감변수로 사용하면 안된다.
		int start = 2000000000;
		int count = 0;
		for(float f = start; f < start + 50; f++) {
			count++;
		}
		System.out.println("결과:" + count); // 0
		
		// 부정확한 부동소수점의 연산
		double a = 0;
		a = 4.7;
		a += 0.4;
		System.out.println(a); // 5.1000000000000005
		System.out.println(a == 5.1);

	}

}
