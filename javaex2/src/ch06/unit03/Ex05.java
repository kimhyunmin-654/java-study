package ch06.unit03;

public class Ex05 {
	int width;
	int height;
	
	public int area() {
		return width * height;
	}

	public static void main(String[] args) {
		// width = 10; // 컴파일 오류
		Ex05 obj = new Ex05();
		obj.width = 10;
		obj.height = 20;
		
		int s = obj.area();
		System.out.println("결과 : " + s);

	}

}


