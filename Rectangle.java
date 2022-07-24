package Abstract;


public class Rectangle implements Shape

{
	private double width;
	private double length;

	Rectangle() {
		this.width = 1;
		this.length = 1;
	}

	Rectangle(double w, double l) {
		this.width = w;
		this.length = l;

	}

	public double area() {
		return width * length;
	}

	public double perimeter() {
		return 2 * (length + width);
	}
}
