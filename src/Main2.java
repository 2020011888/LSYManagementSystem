

import java.util.Scanner;

public class Main2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int result = 0;
		
		System.out.println("���� �Է�: ");
		int a = sc.nextInt();
		
		System.out.println("������ �Է�: ");
		String b = sc.next();
		
		System.out.println("���� �Է�: ");
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
		System.out.println("�����: "+ result);
		
	}
}
