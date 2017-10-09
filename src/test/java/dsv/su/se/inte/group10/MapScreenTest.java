package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapScreenTest {
	
    @Test
    public void testMapExists() {
    	MapScreen ms = new MapScreen();
        assertNotNull(ms);
    }
    
    @Test
    public void testMapWidth() {
    	MapScreen ms = new MapScreen();
    	assertEquals(600, ms.getWidth());
    }
    
    @Test
    public void testMapHeight() {
    	MapScreen ms = new MapScreen();
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
    	MapScreen ms = new MapScreen();
    	assertEquals(600, ms.getWidth());
    	assertEquals(600, ms.getHeight());
    }

}