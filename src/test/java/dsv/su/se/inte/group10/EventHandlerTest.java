package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

public class EventHandlerTest {
	
	Player c = new Player();
	NPC npc = new NPC("Orch");
	MapScreen ms = new MapScreen();
	EventHandler eh = new EventHandler(ms);
	
	public EventHandlerTest() {
		ms.addObject(c, 5, 5);
	}
	
	@Test
	public void testEventHandler() {
		assertNotNull(new EventHandler(ms));
	}
	
	@Test
	public void testAIMovementEvent() {
		assertEquals(-1, eh.getAction(npc));
	}
	
	@Test
	public void testGetAction() {
		
	}
}
