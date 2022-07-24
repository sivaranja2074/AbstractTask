package Abstract;


public class Square implements Shape {
	private double area;

	Square() {
		this.area = 1;
	}

	Square(double a) {
		this.area = a;
	}

	public double area() {
		return area * area;
	}

	public double perimeter() {
		return 4 * area;
	}
}