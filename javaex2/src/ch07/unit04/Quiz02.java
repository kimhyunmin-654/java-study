package ch07.unit04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		   Q) 문자열로 수식을 입력 받아 연산하는 프로그램 작성
		     - 실행예
		       수식 ? 13/3
		       13/3 = 4
		     - 부호가 없는 양수만 입력하고 연산자는 + - * / 만 
		       입력했다는 가정하여 문제를 해결    
		 */
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("수식[3+4] ? ");
		input = sc.nextLine(); // 공백 입력도 허용
		
		input = input.replaceAll("\\s", "");
		
		String p = "^\\d+[\\+\\-\\*\\/]\\d+$";
		if(! input.matches(p)) {
			System.out.println("연산 수식 입력 오류..");
			sc.close();
			return;
		}
		
		/*
		// 35+10 : ss[0]<-"35", ss[1]<-"10"
		p = "[\\+\\-\\*\\/]";
		String[] ss = input.split(p);
		char op = input.charAt(ss[0].length());
		int n1 = Integer.parseInt(ss[0]);
		int n2 = Integer.parseInt(ss[1]);
		String result = null;
		
		switch(op) {
		case '+':result = String.format("%s=%d", input, n1+n2); break;
		case '-':result = String.format("%s=%d", input, n1-n2); break;
		case '*':result = String.format("%s=%d", input, n1*n2); break;
		case '/':result = String.format("%s=%d", input, n1/n2); break;
		}
		System.out.println(result);
		*/
		
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = input.indexOf(op);
			if(pos > 0) {
				/*
				// 123*13
				System.out.println(pos); // 3
				System.out.println(input.charAt(pos)); // *
				System.out.println(input.substring(0, pos)); // 123
				System.out.println(input.substring(pos+1)); // 12
				*/
				
				int n1 = Integer.parseInt(input.substring(0, pos));
				int n2 = Integer.parseInt(input.substring(pos+1));
				
				int result = 0;
				switch(op) {
				case "+": result = n1 + n2; break;
				case "-": result = n1 - n2; break;
				case "*": result = n1 * n2; break;
				case "/": result = n1 / n2; break;
				}
				System.out.printf("%d %s %d = %d\n",
						n1, op, n2, result);
				break;
			}
		}
		
		sc.close();

	}

}
