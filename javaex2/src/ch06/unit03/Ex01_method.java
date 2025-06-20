package ch06.unit03;


public class Ex01_method {

	public static void main(String[] args) {
		Test1 t = new Test1();
		
		int result;
		
		result = t.sub(5); // 메소드를 호출
		System.out.println(result);
		
		t.sub(10);
	}

}
/*
 -> 지역변수, 매개변수
 	: 메소드 안에서만 사용 가능
 	: 메소드를 호출할때 메모리를 할당 받고, 메소드를 빠져 나가면 메모리가 해제
 	: 값을 할당해야 사용 가능(자동 초기화가 안됨)
 	: 스택메모리 공간에 메모리 할당 
 	
 - 인스턴스 변수
 	: 클래스 안 모든 인스턴스 메소드에서 사용 가능
 	: new를 이용하여 객체를 생성할때 메모리 할당을 받음.
 	: 메모리 해제는 객체가 null 이되거나 오랫동안 사용되지 않으면 JVM에 의해 해제
 	: 객체가 생성될때 숫자필드는 0, 객체는 null 로 초기화
 	: 힙메모리 공간에 메모리 할당
 */


class Test1 {
	int a = 10; // 필드(인스턴스변수)
	
	public int sub(int n) { // n : 매개변수(파라미터, 인수)
		int s = 0; // 지역변수
		
		s = n + a;
		
		for(int i = 0 ; i < s; i++) {
			System.out.print('-');
		}
		System.out.println();
		
		return s; // 반환값을 가지고 호출한 곳으로
		
		// System.out.println(); // return 아래에는 실행문이 올수없다.
		// break, continue도 아래에 올 수 없으니 return도 아래에 올수없다.
	}
	
	public void dsip() {
		System.out.println(a);
	}
}
