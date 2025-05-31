package ch11.unit02;

public class Ex05 {

	public static void main(String[] args) {
		TestImp15<Integer> t = new TestImp15<>();
		t.print(10);
		
		DemoImp15 ob = new DemoImp15();
		ob.print("자바");
	}

}

// 제네릭 인터페이스
interface Test5<T> {
	public void print(T t);
}

// 구현 클래스 1
class TestImp15<T> implements Test5<T> {

	@Override
	public void print(T t) {
		System.out.println(t);
	}
	
}

//구현 클래스 2
class DemoImp15 implements Test5<String> {

	@Override
	public void print(String t) {
		System.out.println(t);
	}
	
}