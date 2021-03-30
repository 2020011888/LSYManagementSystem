package helloworld;

import java.util.Random;
import java.util.Scanner;

public class CoinGuess {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = r.nextInt(2) + 1;
			System.out.println("Input coin number. (1-H / 2-T) : ");
			int coin = sc.nextInt();
		
		if(num == coin) {
			System.out.println("Correct");
			break;
		}
			else {
				System.out.println("Incorrect");
			}
		
		}
	}
}
