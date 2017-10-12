package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumableTest {

	Consumable cs = new Consumable("Life potion", 1, 15, new Effect(StatType.currentHP, 10));
	
	@Test
	public void testHasEffect() {
		assertNotNull(cs.getEffect());
	}
}
