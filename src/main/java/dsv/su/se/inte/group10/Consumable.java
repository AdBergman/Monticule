package dsv.su.se.inte.group10;

import java.util.ArrayList;

public class Consumable extends Item {
	
	private ArrayList<Stat> statList;
	
	public Consumable(String name, int weight, int value, Stat...stats) {
		super(name, weight, value);
		statList = new ArrayList<Stat>();
		for(Stat s : stats) {
			statList.add(s);
		}
	}

	public ArrayList<Stat> getEffects(){
		return new ArrayList<Stat>(statList);
	}
	
}