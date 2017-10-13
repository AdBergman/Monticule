package dsv.su.se.inte.group10;

public class ObjectInteractionEvent extends Event {
	
	public boolean pickUpItem(Player p, Item i) {
		p.getBackpack().addItem(i);
		return true;
	}

}
