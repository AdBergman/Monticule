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
	public void testBackpackWeight() {
		Backpack bp = new Backpack(11, 20);
		assertEquals(20, bp.getWeightLimit());
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
		assertTrue(bp.addItem(item));
		assertTrue(bp.removeItem(item));
	}
	
	@Test
	public void testRemoveItemNotInList() {
		Item item = new Item("Medium item", 6, 8);
		assertFalse(bp.removeItem(item));
	}
	
}
