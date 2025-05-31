package ch04.unit03;

public class Quiz03 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		int cnt = 0;
		
		while(ch <= 'Z') {
			System.out.print(ch + "\t");
			ch++;
			
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
			
		}

	}

}
