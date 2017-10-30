package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackpackTest {
	
	Backpack bp = new Backpack();
	
	
	@Test
	public void testIsBackpack() {
		assertNotNull(bp);
	}
	
	
	@Test
	public void testBackpackLimit() {
		Backpack bp = new Backpack(10, 15);
		assertEquals(10, bp.getItemLimit());
	}
	
	@Test
	public void testBackpackWeightLimit() {
		Backpack bp = new Backpack(11, 20);
		assertEquals(20, bp.getWeightLimit());
	}
	
	@Test
	public void testBackpackContentWeight() {
		Backpack bp = new Backpack(11, 20);
		bp.addItem(new Item("Thing one", 3, 3));
		bp.addItem(new Item("Thing two", 3, 3));
		bp.addItem(new Item("Thing three", 3, 3));
		assertEquals(9, bp.getTotalWeight());
	}
	
	@Test
	public void testAddItemToBackpack() {
		Item item = new Item("Big item", 10, 10);
		assertTrue(bp.addItem(item));
	}
	
	@Test
	public void testAddTooHeavyItemToBackpack() {
		Item item = new Item("Big item", 50, 10);
		assertFalse(bp.addItem(item));
	}
	
	@Test
	public void testRemoveItem() {
		Item item = new Item("Medium item", 5, 7);
		bp.addItem(item);
		assertTrue(bp.removeItem(item));
		assertFalse(bp.containsItem(item));
	}
	
	@Test
	public void testRemoveItemNotInList() {
		Item item = new Item("Medium item", 6, 8);
		assertFalse(bp.removeItem(item));
	}
	
	@Test(expected = java.util.NoSuchElementException.class)
	public void testSwapItemNotInBackpack() {
		bp.swapItem(new ItemEquippable("Thing one", EquipmentType.HELMET), new ItemEquippable("Thing two", EquipmentType.BOOTS));
	}
	
	@Test(expected = java.util.NoSuchElementException.class)
	public void testSwapNullItem() {
		bp.swapItem(null, new ItemEquippable("Thing two", EquipmentType.BOOTS));
	}
	
	@Test
	public void testSwapItems() {
		ItemEquippable itemOne = new ItemEquippable("Thing one", EquipmentType.HELMET);
		ItemEquippable itemTwo = new ItemEquippable("Thing two", EquipmentType.BOOTS);
		bp.addItem(itemOne);
		assertTrue(bp.swapItem(itemOne, itemTwo));
		assertFalse(bp.containsItem(itemOne));
		assertTrue(bp.containsItem(itemTwo));
	}
	
	@Test
	public void testSwapItemTooHeavyForBackpack() {
		ItemEquippable itemOne = new ItemEquippable("Thing one", EquipmentType.HELMET, 5, 10);
		ItemEquippable itemTwo = new ItemEquippable("Thing two", EquipmentType.BOOTS, 20, 10);
		bp.addItem(itemOne);
		assertFalse(bp.swapItem(itemOne, itemTwo));
		assertTrue(bp.containsItem(itemOne));
		assertFalse(bp.containsItem(itemTwo));
	}
	
}
