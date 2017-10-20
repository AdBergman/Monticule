package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

public class InputHandlerTest {
	
	private InputHandler ih = new InputHandler();

	@Test
	public void testInputUp() {
		@SuppressWarnings("deprecation")
	char c = new KeyEvent(null, 0, 0, 0, KeyEvent.VK_UP).getKeyChar();
	KeyEvent ke = new KeyEvent(null, 0, 0 ,0, KeyEvent.VK_UP, c);
	
		ih.keyPressed(ke);
		assertEquals(38, ih.getKeyCode());
	}

}
