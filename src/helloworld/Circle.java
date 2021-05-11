package helloworld;

public class Circle extends Shape {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void getArea() {
		System.out.println("The area of the Circle is " + (double)(this.radius*this.radius*3.14) + ".");
	}
}
