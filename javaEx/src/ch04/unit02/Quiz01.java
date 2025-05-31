package ch04.unit02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String result;
		
		System.out.print("점수 ? ");
		n = sc.nextInt();
		
		
		
		switch(n/10) {
		case 10:   
		case 9: result = "수"; break;   
		case 8: result = "우"; break;  
		case 7: result = "미"; break;
		case 6: result = "양"; break;
		default: result = "가"; break;
		}
		
		System.out.printf("점수 : %d, 판정 : %s\n", n, result);
		
		sc.close();

	}

}
