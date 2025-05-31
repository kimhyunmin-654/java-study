package ch03.unit01;

public class Ex07 {

	public static void main(String[] args) {
		String s;
		
		// String + : 문자열 결합
		s = "korea" + 9 + 3;
		System.out.println(s); // korea93
		
		s = 9 + 3 + "korea";
		System.out.println(s); // 12korea
		
		s = '0' + 3 + "korea"; // 51korea
		System.out.println(s);

		s = 'A' + 3 + "korea"; // 68korea
		System.out.println(s);
		
		s = 'A' + "korea" + 3; //Akorea3
		System.out.println(s);
		
		s = "korea" + 3 + 'A'; //korea3A
		System.out.println(s);

	}

}
