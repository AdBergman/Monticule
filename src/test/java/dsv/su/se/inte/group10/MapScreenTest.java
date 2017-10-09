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

}