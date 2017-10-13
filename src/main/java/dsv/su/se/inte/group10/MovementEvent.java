package dsv.su.se.inte.group10;

public class MovementEvent extends Event {
	
	protected void moveUp(MapScreen m, Player p) {
		MapScreen.Coordinate coord = m.getCoordinate(p);
		
		if(0 <= coord.y-1) {
			m.removeObject(coord.x, coord.y);
			m.addObject(p, coord.x, coord.y-1);
		}
	}
	
	protected void moveDown(MapScreen m, Player p) {
		MapScreen.Coordinate coord = m.getCoordinate(p);
		
		if(coord.y+1 <= m.map[0].length) {
			m.removeObject(coord.x, coord.y);
			m.addObject(p, coord.x, coord.y+1);
		}
	}
	
	protected void moveLeft(MapScreen m, Player p) {
		MapScreen.Coordinate coord = m.getCoordinate(p);
		
		if(0 <= coord.x-1) {
			m.removeObject(coord.x, coord.y);
			m.addObject(p, coord.x-1, coord.y);
		}
	}
	
	protected void moveRight(MapScreen m, Player p) {
		MapScreen.Coordinate coord = m.getCoordinate(p);
		
		if(coord.x+1 <= m.map.length) {
			m.removeObject(coord.x, coord.y);
			m.addObject(p, coord.x+1, coord.y);
		}
	}

}
