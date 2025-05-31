package ch04.unit03.forEx2;

public class Quiz06 {

	public static void main(String[] args) {
		// 완전수
		int s;
		for (int i = 4; i <= 1000; i++) { // 4
			s = 0;
			for (int j = 1; j < i; j++) { // 1 2 3
				if (i % j == 0) { // 4/1 4/2 4/3 ... 1000/1 ..1000/999
					s += j;
				}
			}
			if (s == i) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();

	}

}
