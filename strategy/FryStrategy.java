public class FryStrategy implements IFood{
	public void cook(Food food){
		System.out.println("Frying "+food.name+" in canola oil.");
	}
}