package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackpackTest {
	
	Backpack bp = new Backpack(10,20);
	
	@Test
	public void testIsBackpack() {
		assertNotNull(bp);
	}
	
	
	@Test
	public void testBackpackLimit() {
		assertEquals(10, bp.getItemLimit());
	}
	
	@Test
	public void testBackpackWeight() {
		assertEquals(20, bp.getWeightLimit());
	}

}
