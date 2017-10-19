//package dsv.su.se.inte.group10;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class EquippedListTest {
//
//	Backpack bp = new Backpack(10,20);
//	EquippedList el = new EquippedList();
//	ItemEquippable item1 = new ItemEquippable("Sword", EquipmentType.MAINHAND);
//	ItemEquippable item2 = new ItemEquippable("Axe", EquipmentType.MAINHAND);
//	
//	@Test
//	public void testEquipItem() {
//		el.equipItem(item1, bp);
//		assertTrue(el.equipmentList.contains(item1));
//	}
//	
//	@Test
//	public void testEquipItemInExistingSlot() {
//		el.equipItem(item1, bp);
//		el.equipItem(item2, bp);
//		assertTrue(el.equipmentList.contains(item2));
//	}
//	
//	@Test
//	public void testUnEquipItem() {
//		
//	}
//	
//	@Test
//	public void testEquipItemPreviousRemoved() {
//		el.equipItem(item1, bp);
//		el.equipItem(item2, bp);
//		assertFalse(el.equipmentList.contains(item1));
//	}
//	
//}
