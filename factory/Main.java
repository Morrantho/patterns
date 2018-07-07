public class Main{
	public static void main(String[] args) {
		Shape square = ShapeFactory.create("square");
		square.display();

		Shape circle = ShapeFactory.create("circle");
		circle.display();

		Shape triangle = ShapeFactory.create("triangle");
		triangle.display();

		Shape rectangle = ShapeFactory.create("rectangle");
		rectangle.display();
	}
}