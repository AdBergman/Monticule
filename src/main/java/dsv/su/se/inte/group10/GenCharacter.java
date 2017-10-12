package dsv.su.se.inte.group10;

/**
 * General character will be an abstract class for all characters in the game.
 */

public class GenCharacter {
	
	private final static int DEFAULT_HP = 100;
	private final static int DEFAULT_SPEED = 10;
	private final static int DEFAULT_DAMAGE = 10;
	
	private int maxHP;
	private int currentHP;
	
	private int speed;
	private int damage;

	public GenCharacter() {
		this(DEFAULT_HP, DEFAULT_SPEED, DEFAULT_DAMAGE);
	}
	
	public GenCharacter(int maxHP, int speed, int damage) {
		this.maxHP = maxHP;
		this.currentHP = maxHP;
		this.speed = speed;
		this.damage = damage;
	}
	
//	private Position position = new Position(10, 10);

    public int getDamage(){
        return 1;
    }

    public int getSpeed(){
        return 1;
    }

    public int getMaxHP(){
        return 1;
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
