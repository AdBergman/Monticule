package dsv.su.se.inte.group10;

public class EventHandler {
	
	private class AI {
		public int getAction(NPC npc) {
			return -1;
		}
	}
	
	MapScreen mapScreen;
	
	public EventHandler(MapScreen ms) {
		this.mapScreen = ms;
	}
	
	protected void getAction(NPC npc) {
		doEvent(npc, new AI().getAction(npc));
	}
	
	protected void getAction(Player p) {
		doEvent(p, new InputHandler().getAction());
	}
	
	public void doEvent(Creature c, int i) {
		switch(i) {
		case 1: c.moveUp(mapScreen);
		case 2: c.moveDown(mapScreen);
		case 3: c.moveLeft(mapScreen);
		case 4: c.moveRight(mapScreen);
		}
	}

}
