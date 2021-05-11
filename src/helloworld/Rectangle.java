package helloworld;
public class Rectangle extends Shape {
	int width, height;
	public void Rectangel(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void getArea() {
		System.out.println("The area of the Rectangle is " + (width*height) + ".");

	}
}
