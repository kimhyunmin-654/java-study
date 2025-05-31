package ch04.unit03.forEx;

/*
*********
 *******
  *****
   ***
    *
*/

public class Ex26_star {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) { // 5 4 3 2 1
			for(int j=1; j<=5-i; j++) { // 0 1 2 3 4
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) { // 9 7 5 3 1
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
