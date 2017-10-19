package dsv.su.se.inte.group10;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Player extends Character {

	private static final String DEFAULT_NAME = "Kim";
	
	private String name;
	private Backpack backpack = new Backpack();
	private HashMap<EquipmentType, ItemEquippable> equippedList = new HashMap<EquipmentType, ItemEquippable>(); 
	// private EquippedList equippedList = new EquippedList();
	
	public Player() {
		this(DEFAULT_NAME);
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player(String name, int maxHP, int speed, int damage) {
		super(maxHP, speed, damage);
		this.name = name;
	}
	
	public HashMap<EquipmentType, ItemEquippable> getEquippedList() {
		return equippedList;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Backpack getBackpack() {
		return backpack;
	}
	
	protected boolean checkSlot(EquipmentType et) {
		return equippedList.containsKey(et);
	}
	
	protected ItemEquippable getSlot(EquipmentType et) {
		return equippedList.get(et);
	}
	
	public void useObject(ItemEquippable i) {
		backpack.removeItem(i);
		if(equippedList.containsKey(i.getEquipmentType())) {
			backpack.addItem(equippedList.get(i.getEquipmentType()));
		}
		equippedList.put(i.getEquipmentType(), i);
	}
	
	public void useObject(ItemConsumable i) {
		/**
		 * check for status effects and apply
		 * start timer and delete item once
		 * timer reaches zero (0); remove status
		 * effect from active statuses list.
		 */	
	}
	
	public void useObject(Item i) {
		/**
		 * how? what is an item.
		 */
	}
	
	public void unequipObject(ItemEquippable i) {
		if(equippedList.containsValue(i)) {
			if(backpack.getItems().size() < backpack.getItemLimit()) {
				backpack.addItem(equippedList.remove(i.getEquipmentType()));
			} else {
				// show message that this cannot be done.
			}
		} else {
			throw new NoSuchElementException("No such item is equipped.");
		}
	}
	
}
