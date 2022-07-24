package Abstract;

public class ShapeInterface {

	public static void main(String args[])
	{
		System.out.println("Rectangle :");
		Shape rectangle=new Rectangle();
		System.out.println("Rectangle Area : "+rectangle.area());
		System.out.println("Rectangle Perimeter : "+rectangle.perimeter());
		Shape rectangle1=new Rectangle(2,7);
		System.out.println("Rectangle Area : "+rectangle1.area());
		System.out.println("Rectangle Perimeter : "+rectangle1.perimeter());
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Circle :");
		Shape circle=new Circle();
		System.out.println("Circle Area : "+circle.area());
		System.out.println("Circle Perimeter : "+circle.perimeter());
		Shape circle1=new Circle(8);
		System.out.println("Circle Area : "+circle1.area());
		System.out.println("Circle Perimeter : "+circle1.perimeter());
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Square :");
		Shape square=new Square();
		System.out.println("Square Area : "+square.area());
		System.out.println("Square Perimeter : "+square.perimeter());
		Shape square1=new Square(2);
		System.out.println("Square Area : "+square1.area());
		System.out.println("Square Perimeter : "+square1.perimeter());
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Triangle :");
		Shape triangle=new Triangle();
		System.out.println("Triangle Area : "+triangle.area());
		System.out.println("Triangle Perimeter : "+triangle.perimeter());
		Shape triangle1=new Triangle(3,4,5);
		System.out.println("Triangle Area : "+triangle1.area());
		System.out.println("Triangle Perimeter : "+triangle1.perimeter());
	}
}
