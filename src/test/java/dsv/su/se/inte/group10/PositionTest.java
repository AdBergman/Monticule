package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class PositionTest {
	
	Position p = new Position(10, 10);
	
	@Test
	public void testPositionExists() {
		assertNotNull(p);
	}

}
