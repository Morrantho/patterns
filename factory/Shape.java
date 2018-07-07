public class Shape{
	private int width;
	private int height;
	private int sides;

	public void setWidth(int width){this.width=width;}
	public void setHeight(int height){this.height=height;}
	public void setSides(int sides){this.sides=sides;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	public int getSides(){return sides;}

	public void display(){
		System.out.println("Width: "+width+"\n"+"Height:"+height+"\n"+"Sides: "+sides+"\n");
	}

	public Shape(){}
}