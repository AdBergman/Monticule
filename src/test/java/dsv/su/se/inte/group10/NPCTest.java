package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;


public class NPCTest {
	
	private MapScreen mapscreen = new MapScreen();
    private NPC npc = new NPC("Orch");
    
    @Test
    public void testNPCConstructorWithNonDefaultStats() {
    	NPC npc = new NPC("Orch", 20, 30, 4);
    	assertEquals("Orch", npc.getCharacterType());
    	assertEquals(20, npc.getMaxHP());
    	assertEquals(30, npc.getSpeed());
    	assertEquals(4, npc.getDamage());
    }

    @Test
    public void testNPCGetDamage(){
        assertEquals(10, npc.getDamage());
    }

    @Test
    public void testNPCGetSpeed(){
        assertEquals(10, npc.getSpeed());
    }

    @Test
    public void testNPCGetMaxHP(){
        assertEquals(100, npc.getMaxHP());
    }

    @Test
    public void testNPCCurrentHP(){
        assertEquals(100, npc.getCurrentHP());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidHP() {
    	new NPC("Elf", -1, 10, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidSpeed() {
    	new NPC("Dwarf", 10, -1, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidWeight() {
    	new NPC("Goblin", 10, 10, -1);
    }
    
	@Test		
	public void testMoveUp() {		
		mapscreen.map[5][5] = npc;		
		npc.moveUp(mapscreen);		
		assertEquals(npc, mapscreen.getTile(5, 4));		
	}		
			
	@Test		
	public void testMoveUpIntoWall() {		
		mapscreen.map[0][0] = npc;		
		npc.moveUp(mapscreen);		
		assertEquals(npc, mapscreen.getTile(0, 0));		
	}		
			
	@Test 		
	public void testMoveDown() {		
		mapscreen.map[5][5] = npc;		
		npc.moveDown(mapscreen);		
		assertEquals(npc, mapscreen.getTile(5, 6));		
	}		
			
	@Test 		
	public void testMoveDownIntoWall() {		
		mapscreen.map[5][9] = npc;		
		npc.moveDown(mapscreen);		
		assertEquals(npc, mapscreen.getTile(5, 9));		
	}		
			
	@Test		
	public void testMoveLeft() {		
		mapscreen.map [5][5] = npc;		
		npc.moveLeft(mapscreen);		
		assertEquals(npc, mapscreen.getTile(4, 5));		
	}		
			
	@Test		
	public void testMoveLeftIntoWall() {		
		mapscreen.map [0][5] = npc;		
		npc.moveLeft(mapscreen);		
		assertEquals(npc, mapscreen.getTile(0, 5));		
	}		
			
	@Test		
	public void testMoveRight() {		
		mapscreen.map[5][5] = npc;		
		npc.moveRight(mapscreen);		
		assertEquals(npc, mapscreen.getTile(6, 5));		
	}		
			
	@Test		
	public void testMoveRightIntoWall() {		
		mapscreen.map[9][5] = npc;		
		npc.moveRight(mapscreen);		
		assertEquals(npc, mapscreen.getTile(9, 5));		
	}
	
//	@Test
//	public void testDropList() {
//		java.util.ArrayList<Item> list = npc.getDropList();
//		list.add(new ItemConsumable("Life portion", 1, 5, new Stat(StatType.currentHP, 15)));
//		assertEquals(1, npc.getDropList().size());
//	}

}
