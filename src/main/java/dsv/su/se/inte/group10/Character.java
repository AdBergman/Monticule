package dsv.su.se.inte.group10;

public abstract class Character {
	
	private final static int DEFAULT_HP = 100;
	private final static int DEFAULT_SPEED = 10;
	private final static int DEFAULT_DAMAGE = 10;
	
	private int maxHP;
	private int currentHP;
	
	private int speed;
	private int damage;

	public Character() {
		this(DEFAULT_HP, DEFAULT_SPEED, DEFAULT_DAMAGE);
	}
	
	public Character(int maxHP, int speed, int damage) {
		this.maxHP = maxHP;
		this.currentHP = maxHP;
		this.speed = speed;
		this.damage = damage;
	}

    public int getDamage(){
        return this.damage;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getMaxHP(){
        return this.maxHP;
    }

    public int getCurrentHP(){
        return 1;
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
