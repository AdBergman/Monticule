package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 * This is a temporary template test class that should be applied to future sub-classes to GenChar.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item();

    @Test
    public void testItemValue(){
        assertEquals(0, item.getValue());
    }
    
    @Test
    public void testItemVeight(){
        assertEquals(0, item.getWeight());
    }
    
    @Test
    public void testItemValueWithInput(){
    	Item item = new Item(0, 10);
        assertEquals(10, item.getValue());
    }
    
    @Test
    public void testItemWeightWithInput(){
    	Item item = new Item(20, 10);
        assertEquals(20, item.getWeight());
    }
}
