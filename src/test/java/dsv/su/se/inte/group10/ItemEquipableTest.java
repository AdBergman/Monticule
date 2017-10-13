package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemEquipableTest {

	Stat dmg = new Stat(StatType.damage, 999);
	Stat maxHP = new Stat(StatType.maxHP, 99);
	Stat speed = new Stat(StatType.speed, 9);
	ItemEquipable item = new ItemEquipable("Cheat!", EquipmentType.MAINHAND, dmg, maxHP, speed);

	@Test
	public void testCreateItemEquipable() {
		assertNotNull(item);
	}

	@Test
	public void testCreateItemEquipableWeightValue() {
		ItemEquipable item2 = new ItemEquipable("Pillow", EquipmentType.OFFHAND, 1, 1);
		assertNotNull(item2);
	}

	@Test
	public void testAttributeDamage() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.damage))
				assertEquals(dmg, s);
		}
	}

	@Test
	public void testAttributeDamageValue() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.damage))
				assertEquals(dmg.getValue(), s.getValue());
		}
	}

	@Test
	public void testAttributeMaxHP() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.maxHP))
				assertEquals(maxHP, s);
		}
	}

	@Test
	public void testAttributeMaxHPValue() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.maxHP))
				assertEquals(maxHP.getValue(), s.getValue());
		}
	}

	@Test
	public void testAttributeSpeed() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.speed))
				assertEquals(speed, s);
		}
	}

	@Test
	public void testAttributeSpeedValue() {
		for (Stat s: item.getStats()) {
			if (s.getType().equals(StatType.speed))
				assertEquals(speed.getValue(), s.getValue());
		}
	}

	@Test
	public void testEquipmentType() {
		assertEquals(EquipmentType.MAINHAND, item.getEquipmentType());

	}


}
