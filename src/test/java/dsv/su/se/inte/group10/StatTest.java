package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatTest {
	
	@Test
	public void testStatValueGreaterThanZero() {
		Stat s = new Stat(StatType.currentHP, 10);
		assertEquals(10, s.getValue());
	}
	
	@Test
	public void testStatTypeNotNull() {
		Stat s = new Stat(StatType.currentHP, 10);
		assertNotNull(s.getType());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testStatValueLowerThanOrEqualToZero() {
		new Stat(StatType.damage, -1);
	}
	
	@Test 
	public void testValidStatType() {
		Stat s1 = new Stat(StatType.maxHP, 10);
		Stat s2 = new Stat(StatType.currentHP, 5);
		Stat s3 = new Stat(StatType.speed, 5);
		Stat s4 = new Stat(StatType.damage, 10);
		
		assertEquals(StatType.maxHP, s1.getType());
		assertEquals(StatType.currentHP, s2.getType());
		assertEquals(StatType.speed, s3.getType());
		assertEquals(StatType.damage, s4.getType());
	}

}
