package ch03.unit05;

public class Ex02_var {

	public static void main(String[] args) {
		// 정수 배열
		int[] arr = {2, 4, 6, 8, 10};
		/*
		for(int n : arr) {
			System.out.print(n + " ");
		}
		*/
		
		int s = 0;
		for(var n : arr) {
			s += n;
		}
		System.out.println("합: " + s);

	}

}
