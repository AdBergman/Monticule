package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class Backpack {
	
	public ArrayList<Item> itemList;
	
	public int itemLimit;
	public int weightLimit;
	
	public Backpack(int itemLimit, int weightLimit) {
		this.itemLimit = itemLimit;
		this.weightLimit= weightLimit;
		itemList = new ArrayList();
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
