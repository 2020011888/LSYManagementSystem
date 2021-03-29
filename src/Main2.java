

import java.util.Scanner;

public class Main2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int result = 0;
		
		System.out.println("숫자 입력: ");
		int a = sc.nextInt();
		
		System.out.println("연산자 입력: ");
		String b = sc.next();
		
		System.out.println("숫자 입력: ");
		int c = sc.nextInt();
		
		switch (b) {
		case "+":
			result = a+c;
			break;
		case "-":
			result = a-c;
			break;
		case "*":
			result = a*c;
			break;
		case "/":
			result = a/c;
			break;
		}
		System.out.println("결과값: "+ result);
		
	}
}
