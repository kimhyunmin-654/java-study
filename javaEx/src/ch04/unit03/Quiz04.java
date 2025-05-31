package ch04.unit03;

public class Quiz04 {

	public static void main(String[] args) {
		
		int n, sum, cnt;
		n = sum = cnt = 0;
		
		while(n < 100) {
			n++;
			if(n%3==0 || n%5==0) {
				sum+=n; //합
				cnt++; //평균								
			}						
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (sum/cnt));

	}

}
