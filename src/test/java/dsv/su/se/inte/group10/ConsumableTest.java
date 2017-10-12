package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumableTest {

	Consumable cs = new Consumable();
	
	@Test
	public void testHasEffect() {
		assertNotNull(cs.getEffect());
	}
}
