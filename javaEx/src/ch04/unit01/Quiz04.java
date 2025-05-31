package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		double grade;
		
		System.out.print("점수 ? ");
		score = sc.nextInt();
		
		
		/*
		if(score>=95 && score <= 100) {
			result = 4.5;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=90 && score <= 94) {
			result = 4.0;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=85 && score <= 89) {
			result = 3.5;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=80 && score <= 84) {
			result = 3.0;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=75 && score <= 79) {
			result = 2.5;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=70 && score <= 74) {
			result = 2.0;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=60 && score <= 69) {
			result = 1.5;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else if(score>=60 && score <= 64) {
			result = 1.0;
			System.out.println("점수 : " + score + ", " +"평점 : " + result);
		} else { 
			result = 0.0;
			System.out.println("입력 오류 : " + result);
		}
		*/
		
		if (score>=0 && score<=100) {
			if(score >= 95) grade = 4.5;
			else if(score >= 90) grade = 4.0;
			else if(score >= 85) grade = 3.5;
			else if(score >= 80) grade = 3.0;
			else if(score >= 75) grade = 2.5;
			else if(score >= 70) grade = 2.0;
			else if(score >= 65) grade = 1.5;
			else if(score >= 60) grade=  1.0;
			else grade = 0.0;
			
			System.out.printf("점수 : %d, 평점 : %.1f\n", score,grade);					
		} else {
			System.out.println("점수 입력 오류 입니다.");
		}
		
		
		sc.close();

	}

}
