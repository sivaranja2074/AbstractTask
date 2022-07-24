package Abstract;


public class Circle implements Shape {
	private double radius;

	Circle() {
		this.radius = 1;
	}

	Circle(double r) {
		this.radius = r;
	}

	public double area() {
		return 2 * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}
