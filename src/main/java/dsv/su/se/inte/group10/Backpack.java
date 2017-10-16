package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class Backpack {
	
	private static final int DEFAULT_ITEMS = 5;
	private static final int DEFAULT_WEIGHT = 10;
	
	private ArrayList<Item> itemList;
	
	private int itemLimit;
	private int weightLimit;
	
	public Backpack() {
		this(DEFAULT_ITEMS, DEFAULT_WEIGHT);
	}
	
	public Backpack(int itemLimit, int weightLimit) {
		this.itemLimit = itemLimit;
		this.weightLimit= weightLimit;
		itemList = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void removeItem(Item item) {
		itemList.remove(item);
	}
	
	public ArrayList<Item> getItems(){
		return new ArrayList<Item>(itemList);
	}
	
    public int getWeightLimit(){
        return this.weightLimit;
    }

    public int getItemLimit(){
        return this.itemLimit;
    }

}
