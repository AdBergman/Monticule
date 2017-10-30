package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Backpack {
	
	private static final int DEFAULT_ITEMS = 5;
	private static final int DEFAULT_WEIGHT = 10;
	
	private ArrayList<Item> itemList;
	
	private int itemLimit;
	private int weightLimit;
	private int totalWeight;
	
	public Backpack() {
		this(DEFAULT_ITEMS, DEFAULT_WEIGHT);
	}
	
	public Backpack(int itemLimit, int weightLimit) {
		if(itemLimit < 1 || weightLimit < 1) {
			throw new IllegalArgumentException("itemLimit and weightLimit must be greater than zero.");
		}
		this.itemLimit = itemLimit;
		this.weightLimit= weightLimit;
		this.totalWeight = 0;
		itemList = new ArrayList<Item>();
	}
	
	public boolean addItem(Item item) {
		if( totalWeight + item.getWeight() <= weightLimit && itemList.size() < itemLimit /* && totalWeight >= 0 */ ) {
			itemList.add(item);
			totalWeight += item.getWeight();
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removeItem(Item item) {
		if(itemList.contains(item)) {
			itemList.remove(item);
			totalWeight -= item.getWeight();
			assert(totalWeight >= 0);
			return true;
		}
		else {
			//inget item som kan tas bort
			return false;
		}
	}
	
	public ItemEquippable swapItem(ItemEquippable get, ItemEquippable put) {
		if(get == null || !itemList.contains(get)) {
			throw new NoSuchElementException("Item to get either does not exist in backpack, or is null.");
		}
		else if((totalWeight - get.getWeight() + put.getWeight()) <= weightLimit) {
			removeItem(get);
			addItem(put);
			return get;
		}
		else {
			return null;
		}
	}
	
	public ArrayList<Item> getItems(){
		return new ArrayList<Item>(itemList);
	}
	
	public boolean containsItem(Item i){
		return itemList.contains(i);
	}
	
    public int getWeightLimit(){
        return this.weightLimit;
    }

    public int getItemLimit(){
        return this.itemLimit;
    }
    
    public int getTotalWeight() {
    	return this.totalWeight;
    }

}
