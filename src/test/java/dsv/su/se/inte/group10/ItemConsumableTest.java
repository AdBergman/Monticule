package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemConsumableTest {

	Stat e1 = new Stat(StatType.currentHP, 50);
	Stat e2 = new Stat(StatType.speed, 10);
	ItemConsumable cs = new ItemConsumable("Life potion", 1, 15, e1, e2);
	
	@Test
	public void testHasEffect() {
		assertNotNull(cs.getStats());
	}
	
	@Test
	public void testLifePotionName() {
		assertEquals("Life potion", cs.getName());
	}
	
	@Test
	public void testConsumableWeight() {
		assertEquals(1, cs.getWeight());
	}
	
	@Test
	public void testConsumableValue() {
		assertEquals(15, cs.getValue());
	}
	
	@Test
	public void testLifePotionEffect1Type() {
		assertEquals(StatType.currentHP, cs.getStats().get(0).getType());
	}
	
	@Test
	public void testLifePotionEffect1Value() {
		assertEquals(50, cs.getStats().get(0).getValue());
	}
	
	@Test
	public void testLifePotionNumberOfEffects() {
		assertEquals(2, cs.getStats().size());
	}
}
