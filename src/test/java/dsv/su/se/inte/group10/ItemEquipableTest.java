package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemEquipableTest {

	Effect dmg = new Effect(StatType.damage, 999);
	Effect maxHP = new Effect(StatType.maxHP, 99);
	Effect speed = new Effect(StatType.speed, 9);
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
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.damage))
				assertEquals(dmg, e);
		}
	}

	@Test
	public void testAttributeDamageValue() {
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.damage))
				assertEquals(dmg.getValue(), e.getValue());
		}
	}

	@Test
	public void testAttributeMaxHP() {
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.maxHP))
				assertEquals(maxHP, e);
		}
	}

	@Test
	public void testAttributeMaxHPValue() {
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.maxHP))
				assertEquals(maxHP.getValue(), e.getValue());
		}
	}

	@Test
	public void testAttributeSpeed() {
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.speed))
				assertEquals(speed, e);
		}
	}

	@Test
	public void testAttributeSpeedValue() {
		for (Effect e: item.getEffects()) {
			if (e.getEffectType().equals(StatType.speed))
				assertEquals(speed.getValue(), e.getValue());
		}
	}

	@Test
	public void testEquipmentType() {
		assertEquals(EquipmentType.MAINHAND, item.getEquipmentType());

	}


}
