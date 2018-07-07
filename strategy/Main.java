public class Main{
	public static void main(String[] args) {
		Food potato  = new Food("Potato");
		Food steak   = new Food("Steak");
		Food eggs    = new Food("Eggs");

		Chef chef    = new Chef();
		chef.cookFood(new BakeStrategy(),potato);
		chef.cookFood(new FryStrategy(),eggs);
		chef.cookFood(new GrillStrategy(),steak);
		chef.cookFood(new GrillStrategy(),potato);
	}
}