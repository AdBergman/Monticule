package dsv.su.se.inte.group10;

public class EventHandler {
	
	private class AI {
		public AI() {
			
		}
		
		public int getAction(NPC npc) {
			return -1;
		}
	}
	
	MapScreen mapScreen;
	InputHandler inputHandler;
	
	public EventHandler(MapScreen ms, InputHandler ih) {
		this.mapScreen = ms;
		this.inputHandler = ih;
	}
	
	private int getAction(Creature c, int i) {
		if(c instanceof NPC) {
			return new AI().getAction((NPC) c);
		}
		else if (c instanceof Player) {
			return inputHandler.getAction(i);
		}
		else {
			return -1;
		}
	}
	
	public int doEvent(Creature c, int key) {
		switch(getAction(c, key)) {
		case 37: c.moveLeft(mapScreen); return 37;
		case 38: c.moveUp(mapScreen); return 38;
		case 39: c.moveDown(mapScreen); return 39;
		case 40: c.moveRight(mapScreen); return 40;
		case -1: return -1;
		default: return -999;
		}
	}

}
