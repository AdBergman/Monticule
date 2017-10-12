package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;
public class ItemEquipableTest {
	
	ItemEquipable ie = new ItemEquipable("Sword", 1, 2, 3);
			
	@Test
	public void testCreateItemEquipable() {
		assertNotNull(ie);
	}
	
	@Test
	public void testCreateItemEquipableWeightValue() {
		ItemEquipable ie2 = new ItemEquipable("Sword", 1, 2, 3, 4, 5);
		assertNotNull(ie2);
	}
	
	@Test
	public void testAttributeMaxHP() {
		assertEquals(1, ie.getMaxHP());
	}
	
	@Test
	public void testAttributeSpeed() {
		assertEquals(2, ie.getSpeed());
	}
	
	@Test
	public void testAttributeDamage() {
		assertEquals(3, ie.getDamage());
	}

}
