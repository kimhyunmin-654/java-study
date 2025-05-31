package ch05.unit01;

public class Ex06 {

	public static void main(String[] args) {
		// 1~100까지 수중 서로 다른 난수 10 발생
		
		int []num = new int[10];
		
		for(int i = 0 ; i<num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
			for(int j=0; j<i; j++) { // 중복 제거 후 다시 난수 발생
				if(num[i] == num[j]) { // ex) num[0]~num[9] == num[0] ~ num[9] 순차적으로 같은 수 비교										
					i--;
					break;
				}
			}
		}
		
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		

	}

}
