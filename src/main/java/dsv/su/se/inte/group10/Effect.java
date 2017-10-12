package dsv.su.se.inte.group10;

public class Effect {
	
	private StatType type; // kan vara maxHP, currentHP, speed, damage
	private int effect; // måste vara >0
	
	public Effect(StatType type, int effect) {
		this.type = type;
		this.effect = effect;
	}
}