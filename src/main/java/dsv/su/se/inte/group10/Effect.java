package dsv.su.se.inte.group10;

public class Effect {
	
	private StatType type; // kan vara maxHP, currentHP, speed, damage
	private int value; // måste vara >0
	
	public Effect(StatType type, int value) {
		this.type = type;
		this.value = value;
	}
}