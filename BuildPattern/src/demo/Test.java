package demo;

public class Test {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.nightMeal();
		meal.showItems();
		
		System.out.println("共消费："+ meal.getCost());
	}
}
