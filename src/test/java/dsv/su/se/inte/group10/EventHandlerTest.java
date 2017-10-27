package dsv.su.se.inte.group10;

import org.junit.Test;

import com.sun.glass.events.KeyEvent;

import static org.junit.Assert.*;

public class EventHandlerTest {
	
	Player player = new Player();
	NPC npc = new NPC("Orch");
	MapScreen ms = new MapScreen();
	EventHandler eh = new EventHandler(ms, new InputHandler());
	
	public EventHandlerTest() {
		ms.addObject(player, 5, 5);
	}
	
	@Test
	public void testEventHandler() {
		assertNotNull(eh);
	}
	
	@Test
	public void testAIMovementEvent() {
		assertEquals(-1, eh.doEvent(npc, 0));
	}
	
	@Test
	public void testPlayerMoveLeftEvent() {
		assertEquals(37, eh.doEvent(player, KeyEvent.VK_LEFT));
	}
	
	@Test
	public void testPlayerMoveUpEvent() {
		assertEquals(38, eh.doEvent(player, KeyEvent.VK_UP));
	}
	
	@Test
	public void testPlayerMoveRightEvent() {
		assertEquals(39, eh.doEvent(player, KeyEvent.VK_RIGHT));
	}
	
	@Test
	public void testPlayerMoveDownEvent() {
		assertEquals(40, eh.doEvent(player, KeyEvent.VK_DOWN));
	}
	
	@Test
	public void testPlayerInvalidKeyEvent() {
		assertEquals(-999, eh.doEvent(player, KeyEvent.VK_PERIOD));
	}
	
	@Test
	public void testInvalidCreatureMovementEvent() {
		assertEquals(-1, eh.doEvent(null, 0));
	}
	
	@Test
	public void testGetAction() {
		
	}
}
