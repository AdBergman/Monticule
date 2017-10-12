package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemEquipable extends Item{

	protected enum EquipmentType{
		MAINHAND, OFFHAND, HELMET, CHESTPLATE, LEGGINGS, BOOTS;
	}

	private EquipmentType et;
	private ArrayList<Effect> effectList;

	public ItemEquipable(String name, EquipmentType et, Effect... effects) {
		super(name);
		this.et = et;
		effectList = new ArrayList<Effect>();
		effectList.addAll(Arrays.asList(effects));
	}

	public ItemEquipable(String name, EquipmentType et, int weight, int value, Effect... effects) {
		super(name, weight, value);
		this.et = et;
		effectList = new ArrayList<Effect>();
		effectList.addAll(Arrays.asList(effects));
	}

	public EquipmentType getEquipmentType() {
		return this.et;
	}

	public ArrayList<Effect> getEffects(){
		return new ArrayList<Effect>(effectList);
	}
}