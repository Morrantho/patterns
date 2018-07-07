public class ShapeFactory{
	private ShapeFactory(){}

	public static Shape create(String type){
		Shape shape;

		switch(type){
			case "square":
				shape = new Square();
				break;
			case "circle":
				shape = new Circle();
				break;
			case "triangle":
				shape = new Triangle();
				break;
			case "rectangle":
				shape = new Rectangle();
				break;
			default:
				shape = new Square();
				break;
		}

		shape.construct();
		return shape;
	}
}