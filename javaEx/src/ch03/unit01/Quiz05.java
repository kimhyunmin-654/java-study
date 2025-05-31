package ch03.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distance, speed;
		int hour, min;
		double seconds;
		double time;
		
		System.out.print("주행 거리(Km) ? ");
		distance = sc.nextInt();
		
		System.out.print("시속(Km/h) ? ");
		speed = sc.nextInt();
		
		time = (double)distance / speed; // 시간
		hour = (int)time;
		min = (int)(time * 60) % 60;  
		seconds = (time * 3600) % 60;
		seconds = (int)(seconds * 100) / 100.0; // 소수점 3번째자리버림
		
		
		System.out.println("주행 거리 : " + distance + "km");
		System.out.println("시속(km) : " + speed);
		System.out.printf("%d시간 %d분 %.2f초 소요\n", hour, min, seconds);
		
		sc.close();

	}

}
