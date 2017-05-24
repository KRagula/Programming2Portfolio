//Should use a different name such as "Foods"
public class SuperClass {
	private double weight;
	private String color;
	private int calories;
	private boolean harvestable;

	SuperClass(double weight, String color, int calories, boolean harvestable) {
		this.weight = weight;
		this.color = color;
		this.calories = calories;
		this.harvestable = harvestable;
	}
	
	public void getWeight() {
		System.out.println("This is the weight: " + weight);
	}
	
	//Add get methods for other variables
	public void getColor() {
		System.out.println("The color is: " + color);
	}
	
	public void getCalories() {
		System.out.println("There are: " + calories + " calories");
	}
	
	public void getHarvestable() {
		System.out.println("Is it ready to be harvested: " + harvestable);
	}
}
