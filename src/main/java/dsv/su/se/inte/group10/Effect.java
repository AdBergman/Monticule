package dsv.su.se.inte.group10;

public class Effect {
	
	private StatType type; // kan vara maxHP, currentHP, speed, damage
	private int value; // måste vara > 0
	
	public Effect(StatType type, int value) {
		if(value <= 0) {
			throw new IllegalArgumentException("Too low");
		}
		this.type = type;
		this.value = value;
	}
	
	public StatType getEffectType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
}