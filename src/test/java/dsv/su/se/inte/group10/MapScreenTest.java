package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapScreenTest {
	
	MapScreen ms = new MapScreen();
	
    @Test
    public void testMapExists() {
        assertNotNull(ms);
    }
    
    @Test
    public void testMapWidth() {
    	assertEquals(600, ms.getWidth());
    }
    
    @Test
    public void testMapHeight() {
    	assertEquals(600, ms.getHeight());
    }
    
    @Test
    public void testMapHeightAndWidthWithInput() {
    	MapScreen ms = new MapScreen(500, 500);
    	assertEquals(500, ms.getWidth());
    	assertEquals(500, ms.getHeight());
    }
    
    @Test
    public void testMapHeightAndWidthWithoutInput() {
    	assertEquals(600, ms.getWidth());
    	assertEquals(600, ms.getHeight());
    }
    
    @Test
    public void testMapScreenHasExit() {
    	assertTrue(ms.getNumberOfExits() > 0);
    }

}