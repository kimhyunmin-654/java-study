package ch04.unit03.forEx2;

public class Quiz08 {

	public static void main(String[] args) {
		// 피타고라스 수
		// a^2 + b^2 = c^2 => a*a + b*b = c*c
		int cnt = 0;
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++) {
				for (int c = 1; c <= 10; c++) {
					if (a * a + b * b == c * c) {
						System.out.println(a + "," + b + "," + c);
						cnt++;
					}
				}
			}
		}
		System.out.println("개수 : " + cnt);
	}

}
