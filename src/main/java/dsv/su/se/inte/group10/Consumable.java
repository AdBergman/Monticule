package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class Consumable extends Item {
	
	private ArrayList<Effect> effectList;
	
	public Consumable(String name, int weight, int value, Effect... effects) {
		super(name, weight, value);
		effectList = new ArrayList<Effect>();
		effectList.addAll(Arrays.asList(effects));
	}

	public ArrayList<Effect> getEffects(){
		return new ArrayList<Effect>(effectList);
	}
	
}