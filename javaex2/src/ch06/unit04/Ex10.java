package ch06.unit04;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println(Test10.a);
		
		Test10.a = 20; // static 변수는 값 변경 가능
		System.out.println(Test10.a); // 20
		
		System.out.println(Test10.PI);
		// Test10.PI = 3.1; // 컴오류
		
		
	}

}

// final 변수 : 한번만 초기화 되며 값을 변경할 수 없는 변수

class Test10 {
	public static int a = 10;
	
	// static fianl 변수 : 클래스가 로딩될때 한번 초기화
	// static final 변수는 선언할때 초기화 하거나 static 초기화 블럭에서 초기화 해야 한다.
	public static final double PI = 3.1415992;
	public final static int x;
	static {
		x = 5;
	}
	
	// 인스턴스 final 변수 : 객체가 생성될때 한번 초기화
	final int b = 10;
	final int c;
	
	public Test10() {
		c = 100;
	}
	
	public void sub() {
		// c = 50; // 컴오류.  final 변수는 일반 메소드에서 값 변경 불가
		System.out.println("sub...");
	}
	
	public int sum(final int n) { // final 매개변수
		int s = 0;
		
		// n = 10; // 컴오류
		
		for(int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s;
	}
}
