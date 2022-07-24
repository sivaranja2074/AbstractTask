package Abstract;


public class Triangle implements Shape {
	private double a, b, c;

	Triangle() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {

		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double perimeter() {

		return a + b + c;
	}

	
}