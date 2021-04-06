package helloworld;

import java.util.Scanner;

public class CarSimulator {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.Setyear(2015);
		myCar.Setmaker("Honda");
		myCar.Setspeed(85.0);
		Scanner input= new Scanner(System.in);
		
		int a = myCar.getYear();
		String b = myCar.getMaker();
		double c = myCar.getSpeed();
		
		System.out.println("year:" + a + " maker:" + b + " speed:" + c);
		System.out.println("year:" + myCar.getYear() + " maker:" + myCar.getMaker() + " speed:" + myCar.getSpeed());
		
		System.out.println("What is changed speed?");
		myCar.speed = input.nextDouble();
		System.out.println("Changed speed : " + myCar.speed);
	}


	}


