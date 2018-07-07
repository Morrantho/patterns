public abstract class Shape{
	public int width;
	public int height;
	public int sides;

	public abstract void construct();

	public void display(){
		System.out.println("Width:"+width+" Height: "+height+" Sides: "+sides);
	}
}