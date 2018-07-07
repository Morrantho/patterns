public class Chef{

	void cookFood(IFood strategy,Food food){
		strategy.cook(food);
	}
}