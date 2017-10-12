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
	
//	public int getMapScreenType() {
//		return mapScreenType;
//	}
}
