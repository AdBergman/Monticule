package dsv.su.se.inte.group10;

import java.util.ArrayList;

public class NPC extends Creature {
	
	private String characterType;
	private ArrayList<Item> dropList;
		
	public NPC(String characterType) {
		super();
		this.characterType = characterType;
	}
	
	public NPC(String characterType, int maxHP, int speed, int damage) {
		super(maxHP, speed, damage);
		this.characterType = characterType;
	}
	
	public String getCharacterType() {
		return this.characterType;
	}
	
	public ArrayList<Item> getDropList() {
		return dropList;
	}
		
}
