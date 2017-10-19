package dsv.su.se.inte.group10;

public abstract class Character {
	
	private final static int DEFAULT_HP = 100;
	private final static int DEFAULT_SPEED = 10;
	private final static int DEFAULT_DAMAGE = 10;
	
	private Stat maxHP;
	private Stat currentHP;
	private Stat speed;
	private Stat damage;

	public Character() {
		this(DEFAULT_HP, DEFAULT_SPEED, DEFAULT_DAMAGE);
	}
	
	public Character(int maxHP, int speed, int damage) {
		if(maxHP < 0) {
			throw new IllegalArgumentException("Max HP cannot be lower than one (1).");
		} else if (speed <= 0 || damage <= 0) {
			throw new IllegalArgumentException("Speed and Damage cannot be lower than zero (0).");
		}
		this.maxHP = new Stat(StatType.maxHP, maxHP);
		this.currentHP = new Stat(StatType.currentHP, maxHP);
		this.speed = new Stat(StatType.speed, speed);
		this.damage = new Stat(StatType.damage, damage);
	}

    public int getDamage(){
        return this.damage.getValue();
    }

    public int getSpeed(){
        return this.speed.getValue();
    }

    public int getMaxHP(){
        return this.maxHP.getValue();
    }

    public int getCurrentHP(){
        return this.currentHP.getValue();
    }

	protected void moveUp(MapScreen m) {
		MapScreen.Coordinate coord = m.getCoordinate(this);
		
		if(0 <= coord.y-1) {
			m.removeObject(coord.x, coord.y);
			m.addObject(this, coord.x, coord.y-1);
		}
	}
	
	protected void moveDown(MapScreen m) {
		MapScreen.Coordinate coord = m.getCoordinate(this);
		
		if(coord.y+1 < m.getHeight()) {
			m.removeObject(coord.x, coord.y);
			m.addObject(this, coord.x, coord.y+1);
		}
	}
	
	protected void moveLeft(MapScreen m) {
		MapScreen.Coordinate coord = m.getCoordinate(this);
		
		if(0 <= coord.x-1) {
			m.removeObject(coord.x, coord.y);
			m.addObject(this, coord.x-1, coord.y);
		}
	}
	
	protected void moveRight(MapScreen m) {
		MapScreen.Coordinate coord = m.getCoordinate(this);
		
		if(coord.x+1 < m.getWidth()) {
			m.removeObject(coord.x, coord.y);
			m.addObject(this, coord.x+1, coord.y);
		}
	}
	
}
