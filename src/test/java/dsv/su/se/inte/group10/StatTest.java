package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatTest {
	
	@Test
	public void testEffectValueGreaterThanZero() {
		Stat e = new Stat(StatType.currentHP, 10);
		assertEquals(10, e.getValue());
	}
	
	@Test
	public void testEffectTypeNotNull() {
		Stat s = new Stat(StatType.currentHP, 10);
		assertNotNull(s.getType());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEffectValueLowerThanOrEqualToZero() {
		new Stat(StatType.damage, -1);
	}

}
