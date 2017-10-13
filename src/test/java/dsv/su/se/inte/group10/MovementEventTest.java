package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovementEventTest {
	
	private MovementEvent me = new MovementEvent();
	private MapScreen mapscreen = new MapScreen();
	private Player player = new Player("Christian");
	
	@Test
	public void testMoveUp() {
		mapscreen.map[5][5] = player;
		me.moveUp(mapscreen, player);
		assertEquals(player, mapscreen.getTile(5, 4));
	}

}

