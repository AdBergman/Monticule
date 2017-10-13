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
		if(maxHP <= 0 || speed <= 0 || damage <= 0) {
			throw new IllegalArgumentException("Arguments cannot be lower than one (1).");
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
    
//    public void moveUp() {
//    	this.position.moveY(-speed);
//    }
//    
//    public void moveDown() {
//    	this.position.moveY(speed);
//    }
//    
//    public void moveLeft() {
//    	this.position.moveX(-speed);
//    }
//    
//    public void moveRight() {
//    	this.position.moveX(speed);
//    }
//    
//    public Position getPosition() {
//    	return this.position;
//    }
}
