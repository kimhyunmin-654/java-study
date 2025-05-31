package ch05.unit03;

import java.util.Arrays;

public class Ex01_arraycopy {

	public static void main(String[] args) {
		// System.arraycopy() : 배열의 내용을 다른 배열에 복사
		// Arrays.toString(배열) : 배열의 값을 문자열로 변화하여 반환
		int[] a = new int[] { 10, 20, 30 };
		int[] b = a; // a와 b는 동일한 곳을 참조

		b[1] = 25;
		System.out.println(a == b); // true
		System.out.println("a배열 : " + Arrays.toString(a));
		System.out.println("b배열 : " + Arrays.toString(b));
		System.out.println();

		int[] x = new int[] { 10, 20, 30 };
		int[] y = new int[3];
				// 원본배열, 원본소스배열의 시작위치, 복사할배열, 복사시킬위치, 복사할개수
		System.arraycopy(x, 0, y, 0, x.length);
		
		System.out.println(x == y); // false
		y[1] = 25;
		System.out.println("x배열 : " + Arrays.toString(x)); // 10, 20, 30
		System.out.println("y배열 : " + Arrays.toString(y)); // 10, 25, 30

	}

}
