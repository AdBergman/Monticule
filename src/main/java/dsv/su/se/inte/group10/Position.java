package dsv.su.se.inte.group10;

class Position {
	
	private int xPos;
	private int yPos;
	
	public Position(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public void moveY(int i) {
		this.yPos = yPos + i;
	}
	
	public void moveX(int i) {
		this.yPos = yPos + i;
	}

}
