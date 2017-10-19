package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 * This is a temporary template test class that should be applied to future sub-classes to GenChar.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.NoSuchElementException;

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
    
    @Test
    public void testGetEquippedList() {
		assertNotNull(player.getEquippedList());
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
	public void testMoveUp() {		
		mapscreen.map[5][5] = player;		
		player.moveUp(mapscreen);		
		assertEquals(player, mapscreen.getTile(5, 4));		
	}		
			
	@Test		
	public void testMoveUpIntoWall() {		
		mapscreen.map[0][0] = player;		
		player.moveUp(mapscreen);		
		assertEquals(player, mapscreen.getTile(0, 0));		
	}		
			
	@Test 		
	public void testMoveDown() {		
		mapscreen.map[5][5] = player;		
		player.moveDown(mapscreen);		
		assertEquals(player, mapscreen.getTile(5, 6));		
	}		
			
	@Test 		
	public void testMoveDownIntoWall() {		
		mapscreen.map[5][9] = player;		
		player.moveDown(mapscreen);		
		assertEquals(player, mapscreen.getTile(5, 9));		
	}		
			
	@Test		
	public void testMoveLeft() {		
		mapscreen.map [5][5] = player;		
		player.moveLeft(mapscreen);		
		assertEquals(player, mapscreen.getTile(4, 5));		
	}		
			
	@Test		
	public void testMoveLeftIntoWall() {		
		mapscreen.map [0][5] = player;		
		player.moveLeft(mapscreen);		
		assertEquals(player, mapscreen.getTile(0, 5));		
	}		
			
	@Test		
	public void testMoveRight() {		
		mapscreen.map[5][5] = player;		
		player.moveRight(mapscreen);		
		assertEquals(player, mapscreen.getTile(6, 5));		
	}		
			
	@Test		
	public void testMoveRightIntoWall() {		
		mapscreen.map[9][5] = player;		
		player.moveRight(mapscreen);		
		assertEquals(player, mapscreen.getTile(9, 5));		
	}
	
	@Test
	public void testItem() {
		player.useObject(new Item("Thing"));
	}
	
	@Test
	public void testUseConsumableItem() {
		ItemConsumable i = new ItemConsumable("Life potion");
		player.getBackpack().addItem(i);
		player.useObject(i);
	}
	
	@Test
	public void testCheckEmptySlots() {
		for(EquipmentType et : EquipmentType.values()) {
			assertFalse(player.checkSlotEquipped(et));
		}
	}
    
    @Test
    public void testUserObjectToEquipItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	
    	player.getBackpack().addItem(i);
    	player.useObject(i);
    	assertEquals(i, player.getSlot(EquipmentType.HELMET));
    	assertFalse(player.getBackpack().getItems().contains(i));
    }
    
    @Test(expected = NoSuchElementException.class)
    public void testUserObjectUnequipUnequippedItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	player.unequipObject(i);
    }
    
    @Test(expected = NoSuchElementException.class)
    public void testUserObjectUseItemEquippableNotInBackpack() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	player.useObject(i);
	}
    
    @Test(expected = NoSuchElementException.class)
    public void testUserObjectUseItemConsumableNotInBackpack() {
    	ItemConsumable i = new ItemConsumable("Life potion", 5, 250, new Stat(StatType.currentHP, 50));
    	player.useObject(i);
    }
    
    @Test
    public void testUserObjectToUnequipItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 1, 250);
    	
    	player.getBackpack().addItem(i);
    	player.useObject(i);
    	player.unequipObject(i);
    	assertTrue(player.getBackpack().containsItem(i));
    	assertFalse(player.getEquippedList().containsValue(i));
    }
    
    @Test
    public void testUserObjectToUnequipTooHeavyItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	ItemEquippable j = new ItemEquippable("Bigass Helmet of Heaviness", EquipmentType.HELMET, 10, 250);
    	
    	player.getBackpack().addItem(i);
    	player.useObject(i);
    	player.getBackpack().addItem(j);
    	player.unequipObject(i);
    	assertFalse(player.getBackpack().getItems().contains(i));
    	assertTrue(player.getEquippedList().containsValue(i));
    }
    
    @Test
    public void testUserObjectToEquipAlreadyEquippedItem() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	ItemEquippable j = new ItemEquippable("Bigass Helmet of Heaviness", EquipmentType.HELMET, 10, 250);
    	
    	player.getBackpack().addItem(i);
    	player.useObject(i);
    	player.getBackpack().addItem(j);
    	player.useObject(j);
    	assertFalse(player.getBackpack().getItems().contains(j));
    	assertTrue(player.getBackpack().getItems().contains(i));
    	assertFalse(player.getEquippedList().containsValue(i));
    	assertTrue(player.getEquippedList().containsValue(j));
    }
    
    @Test
    public void testUserObjectToEquipAlreadyEquippedItemWithNoSpaceInBackpack() {
    	ItemEquippable i = new ItemEquippable("Mighty Helmet of Protecting", EquipmentType.HELMET, 5, 250);
    	ItemEquippable j = new ItemEquippable("Bigass Helmet of Heaviness", EquipmentType.HELMET, 10, 250);
    	ItemEquippable k = new ItemEquippable("Heavy Thing of Carrying", EquipmentType.OFFHAND, 5, 0);
    	
    	player.getBackpack().addItem(j);
    	player.useObject(j);
    	player.getBackpack().addItem(i);
    	player.getBackpack().addItem(k);
    	player.useObject(i);
    	assertFalse(player.getBackpack().getItems().contains(j));
    	assertTrue(player.getBackpack().getItems().contains(i));
//    	assertFalse(player.getEquippedList().containsValue(i));
//    	assertTrue(player.getEquippedList().containsValue(j));
    }

}
