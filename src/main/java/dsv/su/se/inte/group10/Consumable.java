package dsv.su.se.inte.group10;

import java.util.ArrayList;

public class Consumable extends Item {
	
	private ArrayList<Effect> effectList;
	
	public Consumable(String name, int weight, int value, Effect... effects) {
		super(name, weight, value);
		for(Effect e : effects) {
			this.effectList.add(e);
		}
	}

	public ArrayList<Effect> getEffectList(){
		return new ArrayList<Effect>(effectList);
	}
	
	public Effect getEffect(int index){
		if(index < 0 || index >= effectList.size()) {
			throw new IllegalArgumentException("Argument must be greater than or equal to zero (0), and smaller than effectList.size().");
		}
		return effectList.get(index);
	}
	
}