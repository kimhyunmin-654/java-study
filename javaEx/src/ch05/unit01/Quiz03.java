package ch05.unit01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []lotto = new int[6];
		int cnt;
		
		do {
			System.out.print("구매개수[1~5] ? ");
			cnt = sc.nextInt();
		} while( cnt < 1 || cnt > 5);
		
		for(int i = 0; i < cnt; i++) { // 구매 개수
			// 로도 한게임
			for(int n = 0; n < 6; n++) {
				lotto[n] = (int)(Math.random() * 45) + 1;
				
				// 중복값 필터링
				for(int k = 0; k < n; k++) {
					if(lotto[n] == lotto[k]) {
						n--;
						break;
					}
				}
			}
			
			// 정렬
			Arrays.sort(lotto);
			
			// 출력
			System.out.print((i+1) + "게임 : ");
			for(int n : lotto) {
				System.out.printf("%3d", n);
			}
			System.out.println();
		} 
		
		sc.close();
		
		
 
	}

}
