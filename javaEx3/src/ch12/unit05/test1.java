package ch12.unit05;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class test1 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		int n;
		for(int i = 0; i < 6; i++) {
			n = rnd.nextInt(45) + 1;
			set.add(n);
		}
		System.out.print(set);
		System.out.println();
		
		while(set.size() < 6) {
			n = rnd.nextInt(45) + 1;
			set.add(n);
		}
		System.out.print(set);
		System.out.println();
		
	}

}
