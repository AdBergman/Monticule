package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapScreenTest {
	
    @Test
    public void testMapExists() {
    	MapScreen mapScreen = new MapScreen();
        assertNotNull(mapScreen);
    }
    
    @Test
    public void testMapWidth() {
    	MapScreen mS = new MapScreen();
    	assertEquals(600, mS.getWidth());
    }

}