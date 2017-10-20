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
        Creature player = new Player();
        ms.addObject(player, 5, 5);
        assertEquals(player, ms.getTile(5,5));
    }

    @Test
    public void testRemoveObject() {
        ms.map[3][3] = obj;
        ms.removeObject(3, 3);
        assertNotEquals(obj, ms.getTile(3,3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMapWidthConstructor() {
    		new MapScreen(-1, 500);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMapHeightConstructor() {
    		new MapScreen(500, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMapWidthAndHeightConstructor() {
    		new MapScreen(-1, -1);
    }
 
    /*
    @Test(expected = IllegalArgumentException.class)
    public void testGetTileInvalidWidth() {
    		Object obj = new Object();
    		ms.addObject(obj, 5, 5);
    		assertEquals(ms.getWidth(), ms.getTile(4, 5));
    }
    */
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTileInvalidWidth() {
        ms.addObject(obj, 5, 5);
        assertEquals(obj, ms.getTile(-1, 5));
    }
    
    @Test
    public void testBackupCoordinates() {
    	Object obj1 = new Object();
    	ms.getCoordinate(obj1);
    	obj = obj1;
    	assertEquals(obj, obj1);
    	
    }

//    @Test
//    public void testMapScreenType() {
//    	assertTrue(ms.getMapScreenType() >= 0 && ms.getMapScreenType() <= 3);
//    }

}