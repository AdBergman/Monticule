package dsv.su.se.inte.group10;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Player extends Creature {

	private static final String DEFAULT_NAME = "Kim";
	
	private String name;
	private Backpack backpack = new Backpack();
	private HashMap<EquipmentType, ItemEquippable> equippedList = new HashMap<EquipmentType, ItemEquippable>(); 
	
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
		return new HashMap<EquipmentType, ItemEquippable>(equippedList);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Backpack getBackpack() {
		return backpack;
	}
	
	protected boolean checkSlotEquipped(EquipmentType et) {
		return equippedList.containsKey(et);
	}
	
	protected ItemEquippable getSlot(EquipmentType et) {
		if(checkSlotEquipped(et)) {
			return equippedList.get(et);
		}
		else {
			throw new IllegalArgumentException("No such element in equippedList.");
		}
	}
	
	public void useObject(ItemEquippable itemToEquip) {
		if(itemToEquip == null) {
			throw new NoSuchElementException("Argument is null.");
		}
		else if(!backpack.containsItem(itemToEquip)) {
			throw new NoSuchElementException("This item does not exist in inventory.");
		}
		
		boolean success;
		if(equippedList.containsKey(itemToEquip.getEquipmentType())) {
			success = backpack.swapItem(itemToEquip, equippedList.get(itemToEquip.getEquipmentType()));
		} else {
			success = backpack.removeItem(itemToEquip);
		}
		if(success) {
			equippedList.put(itemToEquip.getEquipmentType(), itemToEquip);
		}
	}
	
	public void useObject(ItemConsumable i) {
		if(!backpack.getItems().contains(i)) {
			throw new NoSuchElementException("This item does not exist in inventory.");
		}
		// process status effects
		backpack.removeItem(i);
	}
	
	public void useObject(Item i) {
		/**
		 * how? what is an item.
		 */
	}
	
	public void unequipObject(ItemEquippable i) {
		if(equippedList.containsValue(i)) {
			if(backpack.addItem(i)) {
				equippedList.remove(i.getEquipmentType());
			} else {
				// show message that this cannot be done.
			}
		} else {
			throw new NoSuchElementException("No such item is equipped.");
		}
	}
	
}
