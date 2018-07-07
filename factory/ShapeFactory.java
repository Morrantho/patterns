public class ShapeFactory{
	private ShapeFactory(){}

	public static Shape create(String type){
		switch(type){
			case "Square":
				return new Square();
			case "Circle":
				return new Circle();
			case "Triangle":
				return new Triangle();
			case "Rectangle":
				return new Rectangle();
			default:
				return null;
		}
	}
}