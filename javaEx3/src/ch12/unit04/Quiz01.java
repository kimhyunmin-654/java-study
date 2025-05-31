package ch12.unit04;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Quiz01 {

	public static void main(String[] args) {
		// LOTTO : 1~45 까지 6개
		Set<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		int n;
		
		/*
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(set);
		*/
		
		for(int i = 0; i<6; i++) {
			n = rnd.nextInt(45) + 1;
			set.add(n);
		}
		System.out.println(set);
		
		
	}

}
