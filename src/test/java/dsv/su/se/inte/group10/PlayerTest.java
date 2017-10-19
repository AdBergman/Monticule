package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 * This is a temporary template test class that should be applied to future sub-classes to GenChar.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class PlayerTest {
	
	private MapScreen mapscreen = new MapScreen();
    private Player player = new Player();
    
    @Test
    public void testPlayerConstructorWithNonDefaultStats() {
    	Player p = new Player("Bobbo", 20, 30, 4);
    	assertEquals("Bobbo", p.getName());
    	assertEquals(20, p.getMaxHP());
    	assertEquals(30, p.getSpeed());
    	assertEquals(4, p.getDamage());
    }

    @Test
    public void testPlayerGetDamage(){
        assertEquals(10, player.getDamage());
    }

    @Test
    public void testPlayerGetSpeed(){
        assertEquals(10, player.getSpeed());
    }

    @Test
    public void testPlayerGetMaxHP(){
        assertEquals(100, player.getMaxHP());
    }

    @Test
    public void testPlayerCurrentHP(){
        assertEquals(100, player.getCurrentHP());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidHP() {
    	new Player("Bob", -1, 10, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidSpeed() {
    	new Player("Betty", 10, -1, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidWeight() {
    	new Player("Bubba Gump", 10, 10, -1);
    }
    
    @Test
    public void testUserObjectToEquipItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	
    	player.getBackpack().addItem(i);
    	assertTrue(player.getBackpack().getItems().contains(i));
    	assertFalse(player.checkSlot(EquipmentType.HELMET));
    	
    	player.useObject(i);
    	assertEquals(i, player.getSlot(EquipmentType.HELMET));
    	assertFalse(player.getBackpack().getItems().contains(i));
    }

    @Test

    public void testPlayerMoveUnit(){
        //TODO: once character has position
    }
    public void testUserObjectUnequipItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	
    	player.getBackpack().addItem(i);
    	assertTrue(player.getBackpack().getItems().contains(i));
    	assertFalse(player.checkSlot(EquipmentType.HELMET));
    	
    	player.useObject(i);
    	assertEquals(i, player.getSlot(EquipmentType.HELMET));
    	assertFalse(player.getBackpack().getItems().contains(i));
    	
    	player.unequipObject(i);
    	assertNull(player.getSlot(EquipmentType.HELMET));
    	assertTrue(player.getBackpack().getItems().contains(i));

    }

}
