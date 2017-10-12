package dsv.su.se.inte.group10;

public class Player extends Character {

	private static final String DEFAULT_NAME = "Kim";
	
	private String name;
	
	public Player() {
		this(DEFAULT_NAME);
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player(String name, int maxHP, int speed, int damage) {
		super(maxHP, speed, damage);
		this.name = name;
	}
	
}
