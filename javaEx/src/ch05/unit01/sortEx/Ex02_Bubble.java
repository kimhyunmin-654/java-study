package ch05.unit01.sortEx;

public class Ex02_Bubble {

	public static void main(String[] args) {
		// Bubble Sort
		
		int []num = new int[] {25,15,7,4,12,9,1,7,16,20,13};
		int t;
		
		
		System.out.print("source data : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// sort
		// 1회전 : (1번째:2),(2번째:3),(3번째:4),(4번쨰:5) ...
		// 		   (0:1),	(1:2),	(2:3),	(3:4)
		// 2회전 : (1번째:3),(2번째:3),(3번째:4) ...
		// 		   (0:1),	(1:2),	(2:3)
		for(int i = 1; i<num.length; i++ ) {
			for(int j = 0; j<num.length - i; j++ ) { // 0 < 9
				// System.out.print(j + ":" + (j+1) + " ");
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num[j+1]; num[j+1] = t;
				}
			}
			
			System.out.print(i + "회전 : ");
			for(int n : num) {
				System.out.print(n + "  ");
			}
			System.out.println();
			
		}
				
		
		// 출력
		System.out.print("sort data : ");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		

	}

}
