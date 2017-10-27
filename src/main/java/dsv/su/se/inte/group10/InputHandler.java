package dsv.su.se.inte.group10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;



public class InputHandler implements KeyListener {
	
	private int keyCode;
	private HashMap<Integer, Integer> keys = new HashMap<Integer, Integer>();
	
	public InputHandler() {
		keys.put(KeyEvent.VK_ENTER, 10);
		keys.put(KeyEvent.VK_ESCAPE, 27);
		keys.put(KeyEvent.VK_LEFT, 37);
		keys.put(KeyEvent.VK_UP, 38);
		keys.put(KeyEvent.VK_RIGHT, 39);
		keys.put(KeyEvent.VK_DOWN, 40);
		keys.put(KeyEvent.VK_I, 73);
		keys.put(KeyEvent.VK_R, 82);
	}
	
	public int getAction(int i) {
		return keys.containsKey(i) ? keys.get(i) : -999;
	}
	
//	public void /* ska vara int */ getRandomAction() {
//		 Double random = (Math.random() * 7);
//		 return keys[random.intValue()];
//	}

	
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	            	getKeyCode();
	            break;
	        case KeyEvent.VK_DOWN:
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_LEFT:
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_RIGHT :
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_ENTER :
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_I :
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_R :
	        		getKeyCode();
	            break;
	        case KeyEvent.VK_ESCAPE :
        			getKeyCode();
        			break;
//	        default:
//	        	break;
	    }
	}
	
	public int getKeyCode(){
        return keyCode;
    }
   
   public void keyReleased(KeyEvent e) {
	   
   }
   
   public void keyTyped(KeyEvent e) {
	   
   }
	  
	    

}
