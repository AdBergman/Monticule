package dsv.su.se.inte.group10;

public class MapScreen {
	
	private int width;
	private int height;
	
	public MapScreen() {
		this(600, 600); // default size for map screen.
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
}
