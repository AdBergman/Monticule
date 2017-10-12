package dsv.su.se.inte.group10;

public class Effect {
	
	private EffectType type; // kan vara maxHP, currentHP, speed, damage
	private int value; // måste vara >0
	
	public Effect(EffectType type, int value) {
		this.type = type;
		if(value <= 0) {
			throw new IllegalArgumentException("Too low");
		}
		this.value = value;
	}
	
	public EffectType getEffectType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
}