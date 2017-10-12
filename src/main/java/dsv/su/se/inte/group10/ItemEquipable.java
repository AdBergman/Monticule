package dsv.su.se.inte.group10;

public class ItemEquipable extends Item{
	
	protected enum EquipmentType{
		MAINHAND, OFFHAND, HELMET, CHESTPLATE, LEGGINGS, BOOTS;
	}
	
	private int maxHP;
	private int speed;
	private int damage;
	private EquipmentType et;

	public ItemEquipable(String name, int maxHP, int speed, int damage, EquipmentType et) {
		super(name);
		this.maxHP = maxHP;
		this.speed = speed;
		this.damage = damage;
		this.et = et;
	}
	
	public ItemEquipable(String name, int maxHP, int speed, int damage, EquipmentType et, int weight, int value) {
		super(name, weight, value);
		this.maxHP = maxHP;
		this.speed = speed;
		this.damage = damage;
		this.et = et;
	}
	
	public int getMaxHP() {
		return this.maxHP;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public EquipmentType getEquipmentType() {
		return this.et;
	}
}
