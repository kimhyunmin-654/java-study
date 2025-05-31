package ch05.unit03;

public class Ex02_arraycopy {

	public static void main(String[] args) {
		String[] s1 = new String[] {"자바", "서블릿", "오라클"};
		String[] s2 = new String[s1.length + 3]; // 6
			// 배열에서 객체는 null로 초기화
		
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		
		// 자바 서블릿 오라클
		System.out.println("s1 배열...");
		for(String s : s1) {
			System.out.print(s + "  ");
		}
		System.out.println();
		
		// null 자바 서블릿 null null null
		System.out.println("s2 배열...");
		for(String s : s2) {
			System.out.print(s + "  ");
		}
		System.out.println();
		

	}

}
