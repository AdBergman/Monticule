package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class EffectTest {
	
	@Test
	public void testEffectValueGreaterThanZero() {
		Effect e = new Effect(StatType.currentHP, 10);
		assertEquals(10, e.getValue());
	}
	
	@Test
	public void testEffectTypeNotNull() {
		Effect e = new Effect(StatType.currentHP, 10);
		assertNotNull(e.getEffectType());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEffectValueLowerThanOrEqualToZero() {
		new Effect(StatType.damage, -1);
	}

}
