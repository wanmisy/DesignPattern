package demo;

public class MealBuilder {
	public Meal vegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBugger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal nightMeal() {
		Meal meal = new Meal();
		meal.addItem(new Coffe());
		meal.addItem(new ChickenBugger());
		return meal;
	}
}
