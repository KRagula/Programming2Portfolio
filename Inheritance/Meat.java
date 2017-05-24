public class Meat extends Inheritance{
	Meat(double weight, String color, int calories, boolean harvestable) {
		super(weight, color, calories, harvestable);
	}
	
	//Add entry point
	public static void main(String args[]) {
		Inheritance foods = new Inheritance(40, "red", 500, true);
		foods.getWeight();
		foods.getColor();
		foods.getCalories();
		foods.getHarvestable();
	}
}
