package dsv.su.se.inte.group10;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

public class InputHandlerTest {
	
	private InputHandler ih = new InputHandler();
	private KeyEvent key_left = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_LEFT, Character.forDigit(37, 10));
	private KeyEvent key_up = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_UP, Character.forDigit(38, 10));
	private KeyEvent key_right = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_RIGHT, Character.forDigit(39, 10));
	private KeyEvent key_down = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_DOWN, Character.forDigit(40, 10));
	private KeyEvent key_enter = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_ENTER, Character.forDigit(10, 10));
	private KeyEvent key_i = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_I, Character.forDigit(73, 10));
	private KeyEvent key_r = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_R, Character.forDigit(82, 10));
	private KeyEvent key_escape = new KeyEvent(new javax.swing.JPanel(), 0, 0 ,0, KeyEvent.VK_ESCAPE, Character.forDigit(27, 10));
	
	@Test
	public void testInputLeft() {
		ih.keyPressed(key_left);
		assertEquals(37, ih.getKeyCode());
	}
	
	@Test
	public void testInputUp() {
		ih.keyPressed(key_up);
		assertEquals(38, ih.getKeyCode());
	}
	
	@Test
	public void testInputRight() {
		ih.keyPressed(key_right);
		assertEquals(39, ih.getKeyCode());
	}
	
	@Test
	public void testInputDown() {
		ih.keyPressed(key_down);
		assertEquals(40, ih.getKeyCode());
	}
	
	@Test
	public void testInputEnter() {
		ih.keyPressed(key_enter);
		assertEquals(10, ih.getKeyCode());
	}
	
	@Test
	public void testInputI() {
		ih.keyPressed(key_i);
		assertEquals(73, ih.getKeyCode());
	}
	
	@Test
	public void testInputR() {
		ih.keyPressed(key_r);
		assertEquals(82, ih.getKeyCode());
	}
	
	@Test
	public void testInputEscape() {
		ih.keyPressed(key_escape);
		assertEquals(27, ih.getKeyCode());
	}

	
}
