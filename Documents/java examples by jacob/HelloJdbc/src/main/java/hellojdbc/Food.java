package hellojdbc;

public class Food {

	private int foodID;
	private String foodName;
	private String recipe;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(int foodID, String foodName, String recipe) {
		super();
		this.foodID = foodID;
		this.foodName = foodName;
		this.recipe = recipe;
	}

	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Food [foodID=" + foodID + ", foodName=" + foodName + ", recipe=" + recipe + "]";
	}
	
	
}
