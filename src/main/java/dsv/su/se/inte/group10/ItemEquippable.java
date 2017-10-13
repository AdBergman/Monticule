package dsv.su.se.inte.group10;

public class ItemEquippable extends ItemWithStat {

	private EquipmentType eqType;

	public ItemEquippable(String name, EquipmentType et, Stat... stats) {
		super(name, stats);
		this.eqType = et;
	}

	public ItemEquippable(String name, EquipmentType et, int weight, int value, Stat... stats) {
		super(name, weight, value, stats);
		this.eqType = et;
	}

	public EquipmentType getEquipmentType() {
		return this.eqType;
	}
	
}