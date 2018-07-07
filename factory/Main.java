public class Main{
	public static void main(String[] args) {
		Shape square    = ShapeFactory.Square(32,32);
		Shape rectangle = ShapeFactory.Rectangle(96,96);
		Shape triangle  = ShapeFactory.Triangle(128,128);
		Shape circle    = ShapeFactory.Circle(24,24);

		square.display();
		rectangle.display();
		triangle.display();
		circle.display();
	}
}