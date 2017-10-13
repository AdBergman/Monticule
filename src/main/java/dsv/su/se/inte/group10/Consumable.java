package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class Consumable extends Item {
	
	private ArrayList<Stat> statList;
	
	public Consumable(String name, int weight, int value, Stat...stats) {
		super(name, weight, value);
		statList = new ArrayList<Stat>();
		statList.addAll(Arrays.asList(stats));
	}

	public ArrayList<Stat> getEffects(){
		return new ArrayList<Stat>(statList);
	}
	
}