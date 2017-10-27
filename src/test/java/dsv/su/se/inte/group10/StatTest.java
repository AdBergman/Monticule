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
	public void testValidStatTypeMaxHP() {
		Stat s1 = new Stat(StatType.maxHP, 10);
		assertEquals(StatType.maxHP, s1.getType());
	}
	
	@Test
	public void testValidStatTypeCurrentHP() {
		Stat s2 = new Stat(StatType.currentHP, 5);
		assertEquals(StatType.currentHP, s2.getType());
	}
	
	@Test
	public void testVaildStatTypeSpeed() {
		Stat s3 = new Stat(StatType.speed, 5);
		assertEquals(StatType.speed, s3.getType());
	}
	
	@Test
	public void testVaildStatTypeDamage() {
		Stat s4 = new Stat(StatType.damage, 10);
		assertEquals(StatType.damage, s4.getType());
	}
	
	@Test
	public void testStatTypes() {
		// Fultest för coverage.
		for(StatType st : StatType.values()) {
			assertNotNull(st.name());
		}
	}

}
