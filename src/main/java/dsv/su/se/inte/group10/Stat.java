package dsv.su.se.inte.group10;

public class Stat {
	
	private StatType type; // kan vara maxHP, currentHP, speed, damage
	private int value; // måste vara >0
	
	public Stat(StatType type, int value) {
		if(value <= 0) {
			throw new IllegalArgumentException("Too low");
		}
		this.type = type;
		this.value = value;
	}
	
	public StatType getType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
}