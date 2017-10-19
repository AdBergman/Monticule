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
	
	@Test 
	public void testMoveDown() {
		mapscreen.map[5][5] = player;
		me.moveDown(mapscreen, player);
		assertEquals(player, mapscreen.getTile(5, 6));
	}
	
	@Test
	public void testMoveLeft() {
		mapscreen.map [5][5] = player;
		me.moveLeft(mapscreen, player);
		assertEquals(player, mapscreen.getTile(4, 5));
	}
	
	@Test
	public void testMoveRight() {
		mapscreen.map[5][5] = player;
		me.moveRight(mapscreen, player);
		assertEquals(player, mapscreen.getTile(6, 5));
	}

}

