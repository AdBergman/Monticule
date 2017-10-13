package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemEquipable extends Item {


	private EquipmentType eqType;
	private ArrayList<Stat> statList;

	public ItemEquipable(String name, EquipmentType et, Stat... stats) {
		super(name);
		this.eqType = et;
		statList = new ArrayList<Stat>();
		statList.addAll(Arrays.asList(stats));
	}

	public ItemEquipable(String name, EquipmentType et, int weight, int value, Stat... stats) {
		super(name, weight, value);
		this.eqType = et;
		statList = new ArrayList<Stat>();
		statList.addAll(Arrays.asList(stats));
	}

	public EquipmentType getEquipmentType() {
		return this.eqType;
	}

	public ArrayList<Stat> getStats(){
		return new ArrayList<Stat>(statList);
	}
	
}