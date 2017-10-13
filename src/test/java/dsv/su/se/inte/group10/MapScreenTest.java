package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapScreenTest {
	
	MapScreen ms = new MapScreen();
    Object obj = new Object();
    
    @Test
    public void testMapWidth() {
    	assertEquals(10, ms.getWidth());
    }
    
    @Test
    public void testMapHeight() {
    	assertEquals(10, ms.getHeight());
    }
    
    @Test
    public void testMapHeightAndWidthWithInput() {
    	MapScreen ms = new MapScreen(500, 500);
    	assertEquals(500, ms.getWidth());
    	assertEquals(500, ms.getHeight());
    }
    
    @Test
    public void testMapHeightAndWidthWithoutInput() {
    	assertEquals(10, ms.getWidth());
    	assertEquals(10, ms.getHeight());
    }
    
    @Test
    public void testMapScreenHasExit() {
    	assertTrue(ms.getNumberOfExits() > 0);
    }

    @Test
    public void testGetTile() {
        ms.map[4][4] = obj;
        assertEquals(obj, ms.getTile(4,4));
    }

    @Test
    public void testAddObject() {
        Character player = new Player();
        ms.addObject(player, 5, 5);
        assertEquals(player, ms.getTile(5,5));
    }

    @Test
    public void testRemoveObject() {
        ms.map[3][3] = obj;
        ms.removeObject(3, 3);
        assertNotEquals(obj, ms.getTile(3,3));
    }


//    @Test
//    public void testMapScreenType() {
//    	assertTrue(ms.getMapScreenType() >= 0 && ms.getMapScreenType() <= 3);
//    }

}