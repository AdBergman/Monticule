package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

public class InputHandlerTest {
	
	private InputHandler ih = new InputHandler();
	private KeyEvent key_left = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_UP, Character.forDigit(37, 10));
	private KeyEvent key_up = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_UP, Character.forDigit(38, 10));
	private KeyEvent key_right = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_UP, Character.forDigit(39, 10));
	private KeyEvent key_down = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_UP, Character.forDigit(40, 10));

	@Test
	public void testInputUp() {
		ih.keyPressed(key_up);
		assertEquals(38, ih.getKeyCode());
	}

}
