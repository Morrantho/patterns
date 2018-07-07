public class ShapeFactory{
	private ShapeFactory(){}

	public static Shape Square(int width,int height){
		Shape shape = new Shape();
		shape.setWidth(width);
		shape.setHeight(height);
		shape.setSides(4);
		return shape;
	}

	public static Shape Rectangle(int width,int height){
		Shape shape = new Shape();
		shape.setWidth(width*2);
		shape.setHeight(height);
		shape.setSides(4);
		return shape;
	}

	public static Shape Circle(int width,int height){
		Shape shape = new Shape();
		shape.setWidth(width);
		shape.setHeight(height);
		shape.setSides(8);
		return shape;
	}

	public static Shape Triangle(int width,int height){
		Shape shape = new Shape();
		shape.setWidth(width);
		shape.setHeight(height);
		shape.setSides(3);
		return shape;
	}
}