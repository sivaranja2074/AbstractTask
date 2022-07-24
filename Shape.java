package Abstract;

interface Shape {

	default public void printShape()
	{
		System.out.println("Shape Using Interface");
	}
}

 class RectangleShape implements Shape
{
	
	public void printShape()
	{
		Shape.super.printShape();
		System.out.println("Rectangler Shape");
	}
	
}
 class CircleShape implements Shape
{
	 public void printShape()
		{
			Shape.super.printShape();
			System.out.println("Circular Shape");
		}
		
	
}

