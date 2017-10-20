package dsv.su.se.inte.group10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class InputHandler implements KeyListener {
	
	private int keyCode;
	
	public InputHandler() {
		
	}
	
	public int getAction() {
		return -1;
	}

	
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
	    }
	}
	
	public int getKeyCode(){
        return keyCode;
    }
	   
   public void setKeyCode(int keyCode) {
	   	this.keyCode = keyCode;
    }
   
   public void keyReleased(KeyEvent e) {
	   
   }
   
   public void keyTyped(KeyEvent e) {
	   
   }
	  
	    

}
