package dsv.su.se.inte.group10;

public class MapScreen {
	
	private int width;
	
	public MapScreen() {
		this(600); // default size for map screen.
	}
	
	public MapScreen(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

}
