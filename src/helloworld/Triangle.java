package helloworld;
public class Triangle extends Shape {
	int base, height;
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public void getArea() {
			System.out.print("The area of the Triangle is " + (base*height/2) + ".");
	}
	
}
