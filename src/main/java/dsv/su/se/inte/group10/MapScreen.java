package dsv.su.se.inte.group10;

public class MapScreen {
	
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
	
	private int width;
	private int height;
	private int mapScreenType = 0;
	
	public MapScreen() {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT); // default size for map screen.
	}
	
	public MapScreen(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getNumberOfExits() {
		return 1;
	}
	
	public int getMapScreenType() {
		return mapScreenType;
	}
}
