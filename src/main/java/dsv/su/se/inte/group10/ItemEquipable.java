package dsv.su.se.inte.group10;

public class ItemEquipable extends Item{
	
	private int maxHP;
	private int speed;
	private int damage;

	public ItemEquipable(String name, int maxHP, int speed, int damage) {
		super(name);
		this.maxHP = maxHP;
		this.speed = speed;
		this.damage = damage;
	}
	
	public ItemEquipable(String name, int maxHP, int speed, int damage, int weight, int value) {
		super(name, weight, value);
		this.maxHP = maxHP;
		this.speed = speed;
		this.damage = damage;
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
}
