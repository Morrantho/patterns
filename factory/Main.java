public class Main{
	public static void main(String[] args) {
		Shape a = ShapeFactory.create("Circle");
		a.display();

		Shape b = ShapeFactory.create("Square");
		b.display();

		Shape c = ShapeFactory.create("Triangle");
		c.display();

		Shape d = ShapeFactory.create("Rectangle");
		d.display();
	}
}