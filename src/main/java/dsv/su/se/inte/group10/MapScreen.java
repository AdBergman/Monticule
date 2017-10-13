package dsv.su.se.inte.group10;

public class MapScreen {
	
	private static final int DEFAULT_WIDTH = 10;
	private static final int DEFAULT_HEIGHT = 10;


	private Object[][] map;
	
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

	protected Object getTile(int x, int y) {
		if(x < 0 || x > this.getWidth() || y < 0 || y > this.getHeight()) {
			throw new IllegalArgumentException("Tile coordinates OutOfBounds");
		}
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
