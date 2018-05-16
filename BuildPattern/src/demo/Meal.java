package demo;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.err.print("Item:" + item.name() +"\t");
			System.err.print("Packageing:" + item.packaging().pack() + "\t");
			System.err.println("Cost:" + item.price());
		}
	}
}
