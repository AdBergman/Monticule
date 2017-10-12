package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumableTest {

	Effect e1 = new Effect(StatType.currentHP, 10);
	Effect e2 = new Effect(StatType.maxHP, 5);
	Consumable cs = new Consumable("Life potion", 1, 15, e1, e2);
	
	@Test
	public void testHasEffect() {
		assertNotNull(cs.getEffectList());
	}
	
	@Test
	public void testLifePotion() {
		assertEquals(1, cs.getWeight());
		assertEquals(15, cs.getValue());
		assertEquals("Life potion", cs.getName());
		assertEquals(StatType.currentHP, cs.getEffect(0).getType());
		assertEquals(StatType.maxHP, cs.getEffect(1).getType());
	}
}
