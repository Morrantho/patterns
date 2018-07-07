public class BakeStrategy implements IFood{
	public void cook(Food food){
		System.out.println("Baking "+food.name+" at 350 degrees fahrenheit.");
	}
}