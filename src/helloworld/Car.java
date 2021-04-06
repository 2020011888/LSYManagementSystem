package helloworld;

public class Car {

		int year;
		String maker;
		double speed;
		
		void Setyear(int year) {
			this.year = year;
		}
		void Setmaker(String maker) {
			this.maker = maker;
		}
		void Setspeed(double speed) {
			this.speed = speed;
		}
		int getYear () {
			return year;
		}
		String getMaker () {
			return maker;
		}
		double getSpeed () {
			return speed; 
		}

	}
