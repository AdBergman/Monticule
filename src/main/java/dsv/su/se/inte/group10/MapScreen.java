package dsv.su.se.inte.group10;

public class MapScreen {
	
	private static final int DEFAULT_WIDTH = 10;
	private static final int DEFAULT_HEIGHT = 10;

	protected Object[][] map;
	
//	private int mapScreenType = 0;
	
	public MapScreen() {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT); // default size for map screen.
	}
	
	public MapScreen(int width, int height) {
		if(width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Arguments cannot be lower than zero (0).");
		}
		assert(width > 0 && height > 0);
		this.map = new Object[width][height];
		fillMap();
	}
	
	
	/**
	 * This fills the map for dev purposes.
	 */
	private void fillMap() {
		Object tile = new Object();
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map.length; y++) {
				map[x][y] = tile;
			}
		}
	}
	
	public int getWidth() {
		return map.length;
	}
	
	public int getHeight() {
		return map[0].length;
	}
	
	public int getNumberOfExits() {
		return 1;
	}
	
	protected class Coordinate {
		
		public int x;
		public int y;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	protected Coordinate getCoordinate(Object obj) {
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map[0].length; y++) {
				if(map[x][y] == obj) {
					return new Coordinate(x, y);					
				}
			}
		}
		return new Coordinate(-1, -1);
	}

	protected Object getTile(int x, int y) {
		return map[x][y];
	}

	public void addObject(Object obj, int x, int y){
		map[x][y] = obj;
	}

	public Object removeObject(int x, int y){
		Object obj = map[x][y];
		map[x][y] = null;
		return obj;
	}

//	public int getMapScreenType() {
//		return mapScreenType;
//	}
}
