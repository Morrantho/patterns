public class GrillStrategy implements IFood{
	public void cook(Food food){
		System.out.println("Grilling "+food.name+" for an hour at 300 degrees.");
	}
}