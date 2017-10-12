package dsv.su.se.inte.group10;

import java.util.ArrayList;

public class Consumable extends Item {
	
	private ArrayList<Effect> effectList;
	
	public Consumable(String name, int weight, int value, Effect... effects) {
		super(name, weight, value);
		effectList = new ArrayList<Effect>();
		for(Effect e : effects) {
			effectList.add(e);
		}
	}

	public ArrayList<Effect> getEffects(){
		return new ArrayList<Effect>(effectList);
	}
	
}