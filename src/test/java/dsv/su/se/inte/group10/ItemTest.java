package dsv.su.se.inte.group10;


import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item("Key");

    @Test
    public void testItemValue(){
        assertEquals(0, item.getValue());
    }
    
    @Test
    public void testItemWeight(){
        assertEquals(0, item.getWeight());
    }
    
    @Test
    public void testItemValueWithInput(){
    	Item item = new Item("Key",0, 10);
        assertEquals(10, item.getValue());
    }
    
    @Test
    public void testItemWeightWithInput(){
    	Item item = new Item("Key", 20, 10);
        assertEquals(20, item.getWeight());
    }
    
    @Test
	public void testGetItemEquippedName() {
		assertEquals("Key", item.getName());
	}
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidItemWeightConstructor() {
    		new Item("Key", -1, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidItemValueConstructor() {
    		new Item("Key", 10, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetInvalidWeight() {
    		item.setWeight(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetInvalidValue() {
    		item.setValue(-1);
    }
    
    @Test
    public void testSetValue() {
    	item.setValue(1);
    }
    
    @Test
    public void testWeight() {
    	item.setWeight(2);
    }
}
