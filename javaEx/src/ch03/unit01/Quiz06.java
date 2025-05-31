package ch03.unit01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double kg, cm, m;
		double bmi;
		
		System.out.print("체중(kg) ? ");
		kg = sc.nextDouble();
		
		System.out.print("키(cm) ? ");
		cm = sc.nextDouble();
		
		m = cm / 100;
		bmi = kg / (m * m);
		
		System.out.printf("몸무게 : %.2fkg\n", kg);
		System.out.printf("키 : %.2fm\n", m);
		System.out.printf("BMI : %.1f\n", bmi);
		
		sc.close();
	}

}
